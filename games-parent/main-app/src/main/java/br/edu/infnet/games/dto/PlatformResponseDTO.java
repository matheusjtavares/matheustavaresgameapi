package br.edu.infnet.games.dto;
import br.edu.infnet.games.model.domain.Platform;

public  class PlatformResponseDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private double price;
    private boolean isHandheld;
    private boolean isActive = true;
    private String alias;
    
    public PlatformResponseDTO(Platform platform) {
        this.setId(platform.getId());
        this.setName(platform.getName());
        this.setManufacturer(platform.getManufacturer());
        this.setPrice(platform.getPrice());
        this.setHandheld(platform.isHandheld());
        this.setActive(platform.isActive());
        this.setAlias(platform.getAlias());
    }

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

}
