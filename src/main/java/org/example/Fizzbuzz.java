package org.example;

public class Fizzbuzz {

    public String checkNumber(int number) {
        // Verifica si el número es divisible por 3 y 5 primero
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        // Verifica si el número es divisible solo por 3
        if (number % 3 == 0) {
            return "Fizz";
        }
        // Verifica si el número es divisible solo por 5
        if (number % 5 == 0) {
            return "Buzz";
        }
        // Si no es divisible ni por 3 ni por 5, devuelve el número en formato String
        return Integer.toString(number); // Convierte el número a String
    }
}
