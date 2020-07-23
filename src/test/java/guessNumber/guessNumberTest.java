package guessNumber;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class guessNumberTest {

    int[] answerMockit = {1, 2, 3, 4};

    @Test
    void should_return_4A0B_when_guess_number_given_number_of_correct_position_and_number() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_number_of_incorrect_position_and_number() {
        //given
        int[] inputNumber = {5, 6, 7, 8};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_number_of_incorrect_position_but_correct_number() {
        //given
        int[] inputNumber = {4, 3, 2, 1};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_1A3B_when_guess_number_given_correct_number_with_partial_correct_place() {
        //given
        int[] inputNumber = {1, 4, 2, 3};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A3B", result);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_partial_correct_number_with_partial_correct_place() {
        //given
        int[] inputNumber = {1, 4, 6, 8};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A1B", result);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_partial_correct_number_with_partial_correct_place() {
        //given
        int[] inputNumber = {3, 4, 6, 7};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_wrong_input_input_again_which_input_number_length_is_shorter_than_4() {
        //given
        int[] inputNumber = {1, 9};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_input_input_again_which_input_number_length_is_longer_than_4() {
        //given
        int[] inputNumber = {1, 2, 3, 4, 5, 6, 7};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_input_input_again_when_has_repeat_number() {
        //given
        int[] inputNumber = {1, 1, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_returnwrong_input_input_again_when_input_number_out_of_range() {
        //given
        int[] inputNumber = {-1, 11, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer.generate());

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }
}
