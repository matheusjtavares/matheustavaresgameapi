package br.edu.infnet.games.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.games.model.domain.GameTitle;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity
public class PlatformRequestDTO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min=3,max=50, message = "The name must be between 3 and 50 characters")
    private String name;
    @NotBlank
    @Size(min=3,max=50, message = "The manufacturer must be between 3 and 50 characters")
    private String manufacturer;
    @PastOrPresent(message= "Release Date cannot be in the future")
    private LocalDate releaseDate;
    @Min(0)
    private double price;
    private boolean isHandheld;
    private boolean isActive;
    private List<GameTitle> gameTitles = new ArrayList<>();
    private String alias;

    @Override
    public String toString() {
        String formatString = " Name: %s%n Manufacurer: %s%n Release Date: %s%n Price: % .2f%n Type: %s";
        return String.format(formatString, name,manufacturer,releaseDate,price, (isHandheld == true) ? "Handheld" :"Desk");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
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

    public List<GameTitle> getGameTitles() {
        return gameTitles;
    }

    public void setGameTitles(List<GameTitle> gameTitles) {
        this.gameTitles = gameTitles;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
