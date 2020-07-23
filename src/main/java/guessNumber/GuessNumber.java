package guessNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        if (inputNumber.length < 4) {
            return "Wrong Input,Input again";
        }
        if (inputNumber.length > 4) {
            return "Wrong Input,Input again";
        }
        int a = 0, b = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] == answer[index]) {
                a++;
            } else {
                int finalIndex = index;
                if (IntStream.of(answer).anyMatch(x -> x == inputNumber[finalIndex])) {
                    b++;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
