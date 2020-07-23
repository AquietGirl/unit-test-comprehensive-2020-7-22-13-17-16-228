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
}
