package br.edu.infnet.games.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.games.clients.entities.PlatformGamesResponse;
import br.edu.infnet.games.clients.entities.PlatformResponse;

@FeignClient(name = "theGamesDb", url = "${api.theGamesDb.url}")
public interface GameDBFeignClient {

    @GetMapping("/v1/Platforms/ByPlatformName?apikey=${api.theGamesDb.key}")
    PlatformResponse findPlatformsByName(@RequestParam("name") String name);

    @GetMapping("/v1/Games/ByPlatformID?apikey=${api.theGamesDb.key}")
    PlatformGamesResponse findGamesByPlatformID(@RequestParam("id") Integer id);

}
