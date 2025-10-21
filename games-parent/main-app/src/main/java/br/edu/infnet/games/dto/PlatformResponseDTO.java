package br.edu.infnet.games.dto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.games.model.domain.GameTitle;

public  class PlatformResponseDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private double price;
    private boolean isHandheld;
    private LocalDate releaseDate;
    private boolean isActive = true;
    private String alias;
    private List<GameTitle> gameTitles = new ArrayList<>();


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isHandheld() {
        return isHandheld;
    }
    public void setHandheld(boolean isHandheld) {
        this.isHandheld = isHandheld;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<GameTitle> getGameTitles() {
        return gameTitles;
    }

    public void setGameTitles(List<GameTitle> gameTitles) {
        this.gameTitles = gameTitles;
    }

}
