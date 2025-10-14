package br.edu.infnet.matheustavaresgameapi.model.domain;

import java.util.List;

public class PlatformQueryResult {

    private Long plaftformId;
    private String plaftformAlias;
    private List<String> gamesList;

    public Long getPlaftformId() {
        return plaftformId;
    }

    public void setPlaftformId(Long plaftformId) {
        this.plaftformId = plaftformId;
    }

    public String getPlaftformAlias() {
        return plaftformAlias;
    }

    public void setPlaftformAlias(String plaftformAlias) {
        this.plaftformAlias = plaftformAlias;
    }

    public List<String> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<String> gamesList) {
        this.gamesList = gamesList;
    }
    

}
