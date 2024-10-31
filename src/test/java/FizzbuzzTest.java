import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    @DisplayName("Test si el número es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_ThenReturnFizz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(9);

        // Then
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_ThenReturnBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(10);

        // Then
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 3 y 5")
    void test_whenTheNumberIsDivisibleByFiveAndThree_ThenReturnFizzBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(15);

        // Then
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Test si el número no es divisible por 3 ni 5, devuelve el número")
    void test_whenTheNumberIsNotDivisibleByFiveOrThree_ThenReturnTheNumber() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(16);

        // Then
        assertEquals("16", result); // Compara como String
    }
}
