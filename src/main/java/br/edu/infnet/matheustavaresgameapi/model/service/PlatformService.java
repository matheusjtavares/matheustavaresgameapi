package br.edu.infnet.matheustavaresgameapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.edu.infnet.matheustavaresgameapi.model.clients.GameDBFeignClient;
import br.edu.infnet.matheustavaresgameapi.model.clients.entities.PlatformDataWrapper;
import br.edu.infnet.matheustavaresgameapi.model.clients.entities.PlatformResponse;
import br.edu.infnet.matheustavaresgameapi.model.domain.Platform;
import br.edu.infnet.matheustavaresgameapi.model.domain.PlatformQueryResult;

@Service
public class PlatformService {
    
    private final GameDBFeignClient gameDBFeignClient;
    @Value("${api.theGamesDb.key}")
    private String apiKey;
    public PlatformService(GameDBFeignClient gameDBFeignClient){
        this.gameDBFeignClient = gameDBFeignClient;
    }

    public PlatformQueryResult getGamesbyPlatform(String platformName){
        // Validate platformName

        // Get platforms, api returns a list within the data field of the response
        PlatformResponse response = gameDBFeignClient.findByName("Sega Game Gear");

        PlatformDataWrapper data = response.getData();
        List<Platform> platforms = data.getPlatforms();

        Platform platform = platforms.get(0); // for example
                
        // Get games from platform ID
        PlatformQueryResult platformQueryResult = new PlatformQueryResult();
        platformQueryResult.setPlatformName(platform.getName());
        platformQueryResult.setplatformAlias(platform.getAlias());
        platformQueryResult.setplatformId(platform.getId());
        platformQueryResult.setGamesList(null);
        return platformQueryResult;
    }
}
