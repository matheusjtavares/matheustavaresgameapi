package br.edu.infnet.games.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.edu.infnet.games.clients.GameDBFeignClient;
import br.edu.infnet.games.clients.entities.PlatformDataWrapper;
import br.edu.infnet.games.clients.entities.PlatformGamesDataWrapper;
import br.edu.infnet.games.clients.entities.PlatformGamesResponse;
import br.edu.infnet.games.clients.entities.PlatformResponse;
import br.edu.infnet.games.model.domain.GameTitle;
import br.edu.infnet.games.model.domain.Platform;
import br.edu.infnet.games.model.domain.PlatformQueryResult;

@Service
public class PlatformService {
    
    private final GameDBFeignClient gameDBFeignClient;
    @Value("${api.theGamesDb.key}")
    private String apiKey;
    public PlatformService(GameDBFeignClient gameDBFeignClient){
        this.gameDBFeignClient = gameDBFeignClient;
    }

    public List<Platform> getPlatformsByName(String platformName){
        // Get platforms, api returns a list within the data field of the response
        PlatformResponse response = gameDBFeignClient.findPlatformsByName(platformName);
        PlatformDataWrapper data = response.getData();
        List<Platform> platforms = data.getPlatforms();
        return platforms;
    }
    public PlatformQueryResult getGamesbyPlatformName(String platformName){
        // Validate platformName

        // Get platforms, api returns a list within the data field of the response
        PlatformResponse response = gameDBFeignClient.findPlatformsByName(platformName);

        PlatformDataWrapper data = response.getData();
        List<Platform> platforms = data.getPlatforms();

        Platform platform = platforms.get(0); // for example
        // Get Games By Platform
        Long platformId = platform.getId();
        PlatformGamesResponse platformGamesResponse = gameDBFeignClient.findGamesByPlatformID(platformId);

        PlatformGamesDataWrapper gamesData = platformGamesResponse.getData();
        List<GameTitle> gameTitles = gamesData.getGames();
        GameTitle gameTitle = gameTitles.get(0); // for example
        System.out.println("Result Game Title " + gameTitle.getGame_title());
        // Get games from platform ID
        PlatformQueryResult platformQueryResult = new PlatformQueryResult();
        platformQueryResult.setPlatformName(platform.getName());
        platformQueryResult.setplatformAlias(platform.getAlias());
        platformQueryResult.setplatformId(platform.getId());
        platformQueryResult.setGamesList(gameTitles);
        return platformQueryResult;
    }
    public List<GameTitle> getGamesbyAPIPlatformID(Long id){
        PlatformGamesResponse platformGamesResponse = gameDBFeignClient.findGamesByPlatformID(id);
        PlatformGamesDataWrapper gamesData = platformGamesResponse.getData();
        List<GameTitle> gameTitles = gamesData.getGames();
        return gameTitles;
        
    }
}
