package br.edu.infnet.matheustavaresgameapi.model.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.edu.infnet.matheustavaresgameapi.model.clients.GameDBFeignClient;
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

        // Get platform ID
        Platform platform = gameDBFeignClient.findByName(apiKey, platformName);
        String platformAlias = platform.getAlias();
        Long platformId = platform.getId();
        // Get games from platform ID
        
        PlatformQueryResult platformQueryResult = new PlatformQueryResult();
        platformQueryResult.setPlatformName(platformName);
        platformQueryResult.setplatformAlias(platformAlias);
        platformQueryResult.setplatformId(platformId);
        platformQueryResult.setGamesList(null);
        return platformQueryResult;
    }
}
