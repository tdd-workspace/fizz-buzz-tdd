package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void toReturnOneWhenTheNumberOneIsPassed(){
        assertThat(fizzBuzz.of(1), is(equalTo("1")));
    }
    @Test
    void toReturnFizzWhenTheNumberIsThreeOrItsMultiplesArePassed(){
        assertThat(fizzBuzz.of(3), is(equalTo("Fizz")));
    }
    @Test
    void toReturnBuzzWhenTheNumberIsFiveOrItsMultiplesArePassed(){
        assertThat(fizzBuzz.of(5), is(equalTo("Buzz")));
    }
    @Test
    void toReturnFizzBuzzWhenTheNumberIsMultiplesOfThreeAndFiveArePassed(){
        assertThat(fizzBuzz.of(15),is(equalTo("FizzBuzz")));
    }
    @Test
    void toReturnFizzWhenTheNumberContainsThree(){
        assertThat(fizzBuzz.of(130),is(equalTo("Fizz")));
    }
    @Test
    void toReturnBuzzWhenTheNumberContainsFive(){
        assertThat(fizzBuzz.of(52),is(equalTo("Buzz")));
    }
    @Test
    void toReturnFizzBuzzWhenTheNumberContainsFifteen(){
        assertThat(fizzBuzz.of(152),is(equalTo("FizzBuzz")));
    }
}
