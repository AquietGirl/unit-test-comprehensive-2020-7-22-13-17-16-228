package guessNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameProcessTest {

    @Test
    void should_return_game_over_when_game_count_exceed_6() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GameProcess gameProcess = new GameProcess();
        gameProcess.setGameCount(7);

        //when
        String result = gameProcess.play(inputNumber);

        //then
        assertEquals("Game Over", result);
    }
}
