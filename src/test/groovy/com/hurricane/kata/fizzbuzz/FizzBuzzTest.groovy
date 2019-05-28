package com.hurricane.kata.fizzbuzz


import spock.lang.Specification

import static org.hamcrest.CoreMatchers.equalTo

class FizzBuzzTest extends Specification {
    private static final String FIZZ = 'fizz'
    private static final String BUZZ = 'buzz'
    private static final String FIZZBUZZ = 'fizzbuzz'

    FizzBuzz fizzBuzz = new FizzBuzz()

    def 'should return fizz for numbers dividable by 3'() {
        when:
            final result = fizzBuzz.translate(number)

        then:
            result equalTo(FIZZ)

        where:
            number << [3, 21, 153]
    }

    def 'should return buzz for numbers dividable by 5'() {
        when:
            final result = fizzBuzz.translate(number)
        then:
            result equalTo(BUZZ)
        where:
            number << [5, 25, 200]
    }

    def 'should return fizzbuzz for numbers dividable by 15'() {
        when:
            final result = fizzBuzz.translate(number)
        then:
            result equalTo(FIZZBUZZ)
        where:
            number << [15, 45, 450]
    }

    def 'should return same number when not 3, 5 or 15'() {
        when:
            final result = fizzBuzz.translate(number)
        then:
            result equalTo(number.toString())
        where:
            number << [8, 52, 533]
    }
}
