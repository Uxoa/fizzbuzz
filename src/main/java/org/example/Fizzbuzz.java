package org.example;

public class Fizzbuzz {

    public String checkNumber(int number) {
        // Devolver el número es divisible por 3 y 5 primero
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        // Devolver Fizz si el número es divisible solo por 3
        if (number % 3 == 0) {
            return "Fizz";
        }
        // devolver Buzz si el número es divisible solo por 5
        if (number % 5 == 0) {
            return "Buzz";
        }
        // para números que no son múltiplos de tres y cinco, debe devolver el mismo numero en formato String
        return Integer.toString(number);
    }
}
