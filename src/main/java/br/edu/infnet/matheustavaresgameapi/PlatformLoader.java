package br.edu.infnet.matheustavaresgameapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.matheustavaresgameapi.model.domain.PlatformQueryResult;
import br.edu.infnet.matheustavaresgameapi.model.service.PlatformService;

@Component
public class PlatformLoader implements ApplicationRunner {
    private final PlatformService platformService;

    public PlatformLoader(PlatformService platformService){
        this.platformService = platformService;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        PlatformQueryResult platformQueryResult = platformService.getGamesbyPlatform("PC");
        System.out.println("Result Platform Name " + platformQueryResult.getPlatformName());
        System.out.println("Result Platform alias " + platformQueryResult.getplatformAlias());
        System.out.println("Result Platform id " + platformQueryResult.getplatformId());
    }

}
