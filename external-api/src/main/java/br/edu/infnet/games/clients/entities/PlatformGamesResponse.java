package br.edu.infnet.games.clients.entities;

public class PlatformGamesResponse {
    private Integer code;
    private String status;
    private PlatformGamesDataWrapper data;
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public PlatformGamesDataWrapper getData() {
        return data;
    }
    public void setData(PlatformGamesDataWrapper data) {
        this.data = data;
    }
}
