package guessNumber;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameProcessTest {

    int[] answerMockit = {1, 2, 3, 4};

    @Test
    void should_return_game_over_when_game_count_exceed_6() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);
        gameProcess.setGameCount(7);

        //when
        String result = gameProcess.play(inputNumber);

        //then
        assertEquals("Game Over", result);
    }

    @Test
    void should_return_wrong_message_when_game_result_is_4A0B() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);

        //then
        assertEquals("win, all correct", result);
    }

    @Test
    void should_return_input_number_when_play_game_given_number() {
        //given
        int[] inputNumber = {2, 3, 4, 6};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);

        //then
        assertEquals("0A3B", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_invalid_number_which_length_is_shorter_than_4() {
        //given
        int[] inputNumber = {1, 9};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_invalid_number_which_length_is_longer_than_4() {
        //given
        int[] inputNumber = {1, 9, 3, 4, 6};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_has_the_repeat_number() {
        //given
        int[] inputNumber = {1, 1, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_out_of_range() {
        //given
        int[] inputNumber = {-1, 11, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answerMockit);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.play(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }
}
