package br.edu.infnet.games.model.domain.exceptions;

public class GameTitleNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public GameTitleNotFoundException(String message){
        super(message);
    }
}
