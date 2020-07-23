package guessNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class guessNumberTest {

    @Test
    void should_return_4A0B_when_guess_number_given_number_of_correct_position_and_number() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_number_of_incorrect_position_and_number() {
        //given
        int[] inputNumber = {5, 6, 7, 8};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_number_of_incorrect_position_but_correct_number() {
        //given
        int[] inputNumber = {4, 3, 2, 1};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_1A3B_when_guess_number_given_correct_number_with_partial_correct_place() {
        //given
        int[] inputNumber = {1, 4, 2, 3};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A3B", result);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_partial_correct_number_with_partial_correct_place() {
        //given
        int[] inputNumber = {1, 4, 6, 8};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A1B", result);
    }
}
