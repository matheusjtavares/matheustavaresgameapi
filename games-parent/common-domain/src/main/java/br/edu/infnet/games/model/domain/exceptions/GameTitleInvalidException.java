package br.edu.infnet.games.model.domain.exceptions;

public class GameTitleInvalidException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public GameTitleInvalidException(String message){
        super(message);
    }
}
