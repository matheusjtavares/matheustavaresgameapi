package br.edu.infnet.games.clients.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformResponse {

    private Integer code;
    private String status;
    private PlatformDataWrapper data;
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
    public PlatformDataWrapper getData() {
        return data;
    }
    public void setData(PlatformDataWrapper data) {
        this.data = data;
    }
    
}
