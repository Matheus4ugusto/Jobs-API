package br.com.matheus4ugusto.gestao_vagas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimeiroTeste {

    @Test
    public void should_calculate_the_sum_of_two_numbers(){
        var result = calculate(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void should_validate_wrong_numbers(){
        var result = calculate(2, 3);
        assertNotEquals(4, result);
    }

    public static int calculate(int num1, int num2){
        return num1 + num2;
    }

}
