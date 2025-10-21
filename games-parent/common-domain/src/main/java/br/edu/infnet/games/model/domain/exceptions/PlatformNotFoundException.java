package br.edu.infnet.games.model.domain.exceptions;

public class PlatformNotFoundException  extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public PlatformNotFoundException(String message){
        super(message);
    }
}
