package com.fizzbuzz;

public class FizzBuzz {
    public String of(int input) {
        String stringInput = String.valueOf(input);
        if(input % 15 == 0){
            return "FizzBuzz";
        }
        if(stringInput.contains("15")){
            return "FizzBuzz";
        }
        if(input % 3 == 0){
            return "Fizz";
        }
        if(stringInput.contains("3")){
            return "Fizz";
        }
        if(input % 5 == 0){
            return "Buzz";
        }
        if(stringInput.contains("5")){
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
