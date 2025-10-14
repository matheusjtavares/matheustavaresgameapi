package br.edu.infnet.matheustavaresgameapi.model.domain;

import java.util.List;

public class PlatformQueryResult {

    private String platformName;
    private Long platformId;
    private String platformAlias;
    private List<String> gamesList;

    public Long getplatformId() {
        return platformId;
    }

    public void setplatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getplatformAlias() {
        return platformAlias;
    }

    public void setplatformAlias(String platformAlias) {
        this.platformAlias = platformAlias;
    }

    public List<String> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<String> gamesList) {
        this.gamesList = gamesList;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    

}
