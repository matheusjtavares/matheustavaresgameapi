package br.edu.infnet.games.model.domain.exceptions;

public class PlatformInvalidException  extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public PlatformInvalidException(String message){
        super(message);
    }
}
