package com.fizzbuzz;

public class FizzBuzz {
    public String of(int input) {
        if(isMultipleOfFifteen(input) || isContainsFifteen(input)){
            return "FizzBuzz";
        }
        if(isMultipleOfThree(input) || isContainsThree(input)){
            return "Fizz";
        }
        if(isMultipleOfFive(input) || isContainsFive(input)){
            return "Buzz";
        }
        return convertToString(input);
    }
    private static String convertToString(int input){
        return String.valueOf(input);
    }
    private static boolean isMultipleOfFifteen(int input){
        return input % 15 == 0;
    }
    private static boolean isContainsFifteen(int input){
        return convertToString(input).contains("15");
    }
    private static boolean isMultipleOfThree(int input){
        return input % 3 == 0;
    }
    private static boolean isContainsThree(int input){
        return convertToString(input).contains("3");
    }
    private static boolean isMultipleOfFive(int input){
        return input % 5 == 0;
    }
    private static boolean isContainsFive(int input){
        return convertToString(input).contains("5");
    }
}
