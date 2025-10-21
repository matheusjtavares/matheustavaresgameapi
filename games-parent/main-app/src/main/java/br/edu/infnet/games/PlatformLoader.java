package br.edu.infnet.games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.games.model.domain.Platform;
import br.edu.infnet.games.model.service.PlatformService;

@Component("platformLoader")
@Order(1)
public class PlatformLoader implements ApplicationRunner {
    private final PlatformService platformService;
    public PlatformLoader(PlatformService platformService){
        this.platformService = platformService;
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file  = new FileReader("platforms.txt");
        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();
        String[] fields = null;

        while (line!=null){
            fields = line.split(";");
            Platform platform = new Platform();
            platform.setName(fields[0]);
            platform.setManufacturer(fields[1]);
            platform.setReleaseDate(LocalDate.parse(fields[2]));
            platform.setPrice(Double.parseDouble(fields[3]));
            platform.setHandheld(Boolean.parseBoolean(fields[4]));
            platformService.include(platform);
            line = reader.readLine();
        }

        reader.close();

    }
}
