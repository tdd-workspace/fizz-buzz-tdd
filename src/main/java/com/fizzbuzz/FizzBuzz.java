package com.fizzbuzz;

public class FizzBuzz {
    public String of(int input) {
        if(input % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
