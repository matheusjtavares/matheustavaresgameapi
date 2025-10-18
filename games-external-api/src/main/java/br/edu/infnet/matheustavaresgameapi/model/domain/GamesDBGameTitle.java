package br.edu.infnet.matheustavaresgameapi.model.domain;

import java.util.Date;

public class GamesDBGameTitle {
    private Long id;
    private String gameTitle;
    private Date releaseDate;
    public Long  getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGameTitle() {
        return gameTitle;
    }
    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    
}
