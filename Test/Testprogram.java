import static org.junit.jupiter.api.Assertions.assertEquals;
/*
* File: Testprogram.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2021-09-03
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
import org.junit.Test;

public class Testprogram{
    @Test
    public void testCalculate(){
        Calc calc = new Calc();
        assertEquals(24, calc.calculate(2.0,3.0,4.0));
        assertEquals(1000, calc.calculate(10.0, 10.0, 10.0));
        assertEquals(56, calc.calculate(2.0, 7.0, 4.0));
    }
}
