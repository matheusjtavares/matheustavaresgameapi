package br.edu.infnet.matheustavaresgameapi.model.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.matheustavaresgameapi.model.domain.Platform;

@FeignClient(name = "theGamesDb", url = "${api.theGamesDb.url}")
public interface GameDBFeignClient {
    @GetMapping("/v1/Platforms/ByPlatformName")
    Platform findByName(
        @RequestParam("apikey") String apiKey,
        @RequestParam("name") String name
    );
}
