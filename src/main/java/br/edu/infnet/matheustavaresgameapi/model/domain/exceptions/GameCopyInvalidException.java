package br.edu.infnet.matheustavaresgameapi.model.domain.exceptions;

public class GameCopyInvalidException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public GameCopyInvalidException(String message){
        super(message);
    }
}
