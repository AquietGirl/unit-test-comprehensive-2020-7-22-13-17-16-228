package guessNumber;

import java.util.Arrays;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        if (Arrays.equals(inputNumber, answer)) {
            return "4A0B";
        }
        return null;
    }
}
