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
    void toReturnFizzWhenTheNumberIsThreeOrItsMultiples(){
        assertThat(fizzBuzz.of(3), is(equalTo("Fizz")));
    }
}
