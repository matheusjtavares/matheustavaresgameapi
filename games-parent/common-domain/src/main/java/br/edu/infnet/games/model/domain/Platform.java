package br.edu.infnet.games.model.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "platforms")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Platform {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique=true,length = 100)
    private String name;
    @Column(unique=false, nullable = true)
    private String manufacturer;
    @Column(unique=false, nullable = true)
    private LocalDate releaseDate;
    @Column(unique=false, nullable = true)
    private double price;
    @Column(unique=false, nullable = true)
    private boolean isHandheld;
    @Column(unique=false, nullable = true)
    private boolean isActive;

    @OneToMany(mappedBy="platform",cascade=CascadeType.ALL, orphanRemoval=true,fetch=FetchType.LAZY)
    @JsonManagedReference(value = "platform-gameTitles")   
    private List<GameTitle> gameTitles = new ArrayList<>();
    private String alias;

    @Override
    public String toString() {
        String formatString = " Name: %s%n Manufacurer: %s%n Release Date: %s%n Price: % .2f%n Type: %s";
        return String.format(formatString, name,manufacturer,releaseDate,price, (isHandheld == true) ? "Handheld" :"Desk");
    }
    public Platform() {
    }

    public Platform(Integer id) {
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
