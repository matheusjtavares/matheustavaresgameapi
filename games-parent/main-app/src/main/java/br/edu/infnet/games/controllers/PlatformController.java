package br.edu.infnet.games.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.games.dto.PlatformRequestDTO;
import br.edu.infnet.games.dto.PlatformResponseDTO;
import br.edu.infnet.games.model.domain.GameTitle;
import br.edu.infnet.games.model.domain.Platform;
import br.edu.infnet.games.model.service.PlatformService;


@RestController
@RequestMapping("/api/platforms")
public class PlatformController {
    private final PlatformService platformService;
    public PlatformController(PlatformService platformService){
        this.platformService = platformService;
    }

    @GetMapping("byName/{name}")
    public ResponseEntity<List<Platform>> getPlatformsByName(@PathVariable("name") String name) {
        List<Platform> platforms = platformService.getPlatformsByName(name);
        if(platforms.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(platforms);
    }

    @GetMapping("getPlatformGamesByID/{id}")
    public ResponseEntity<List<GameTitle>> getPlatformsByID(@PathVariable("id") Integer id) {
        List<GameTitle> gameTitles = platformService.getGamesbyAPIPlatformID(id);
        if(gameTitles.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(gameTitles);
    }

    @PostMapping
    public ResponseEntity<PlatformResponseDTO> createPlatform(@RequestBody PlatformRequestDTO dto) {
        PlatformResponseDTO response = platformService.createPlatform(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PlatformResponseDTO>> getAll() {
        return ResponseEntity.ok(platformService.getAllPlatforms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlatformResponseDTO> getPlatform(@PathVariable("id") Integer id) {
        PlatformResponseDTO dto  = platformService.findById(id);
        return ResponseEntity.ok(dto);
    }
}
