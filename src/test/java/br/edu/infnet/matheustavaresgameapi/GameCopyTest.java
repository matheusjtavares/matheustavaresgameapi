package br.edu.infnet.matheustavaresgameapi;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.matheustavaresgameapi.model.domain.GameCopy;
import br.edu.infnet.matheustavaresgameapi.model.domain.exceptions.GameCopyInvalidException;

public class GameCopyTest {
    @BeforeEach
        void setUp(){  
    }
    
    @Test
    public void mustThrowGameCopyInvalidException_whenIdIsLessThanOne() {
        assertThrows(GameCopyInvalidException.class,() -> new GameCopy(0, "Final Fantasy",LocalDate.now(),"Matheus", new BigDecimal(10), true,10));
        assertThrows(GameCopyInvalidException.class,() -> new GameCopy(1, "Final Fantasy",LocalDate.ofYearDay(2026, 1),"Matheus", new BigDecimal(10), true,10));

    }
}
