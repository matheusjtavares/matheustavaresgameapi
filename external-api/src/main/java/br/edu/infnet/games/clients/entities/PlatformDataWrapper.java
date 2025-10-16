package br.edu.infnet.games.clients.entities;

import java.util.List;

import br.edu.infnet.games.model.domain.Platform;

public class PlatformDataWrapper {
    private Integer count;
    private List<Platform> platforms;
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public List<Platform> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }
}
