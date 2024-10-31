import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    @DisplayName("Test si el numero es divisible por 3")
    //escribo el metodo , void pq no va a devolver nada, no tiene return
    void test_whenTheNumberIsDivisibleByThree_ThenReturnFizz(){
    // aceptamos 3 parametros: Given, When y Then para aceptar el test

        // Given "dado"
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When "cuando"
        String result = fizzbuzz.checkNumber(9);

        // Then "pues"
        assertEquals("Fizz",result);

    }

    @Test
    @DisplayName("test_whenTheNumberIsDivisibleByFive_ThenReturnBuzz")
    void test_whenTheNumberIsDivisibleByFive_ThenReturnBuzz(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        //When
        String result = fizzbuzz.checkNumber(10);

        //Then
        assertEquals("Buzz", result);
    }

}
