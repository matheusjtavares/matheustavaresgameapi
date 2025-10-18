package br.edu.infnet.matheustavaresgameapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.matheustavaresgameapi.model.domain.GameTitle;
import br.edu.infnet.matheustavaresgameapi.model.domain.Platform;
import br.edu.infnet.matheustavaresgameapi.model.service.PlatformService;


@RestController
@RequestMapping("/api/platforms")
public class PlatformController {
    private final PlatformService platformService;
    public PlatformController(PlatformService platformService){
        this.platformService = platformService;
    }

    @GetMapping("byName/{name}")
    public ResponseEntity<List<Platform>> getPlatformsByName(@PathVariable String name) {
        List<Platform> platforms = platformService.getPlatformsByName(name);
        if(platforms.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(platforms);
    }

    @GetMapping("getPlatformGamesByID/{id}")
    public ResponseEntity<List<GameTitle>> getPlatformsByID(@PathVariable Long id) {
        List<GameTitle> gameTitles = platformService.getGamesbyAPIPlatformID(id);
        if(gameTitles.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(gameTitles);
    }
}
