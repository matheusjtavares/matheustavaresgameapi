package br.edu.infnet.games.clients.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.edu.infnet.games.model.domain.GameTitle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformGamesDataWrapper {
    private Integer count;
    private List<GameTitle> games;
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public List<GameTitle> getGames() {
        return games;
    }
    public void setGames(List<GameTitle> games) {
        this.games = games;
    }
}
