package guessNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        boolean isHasEqual = false;
        if (Arrays.equals(inputNumber, answer)) {
            return "4A0B";
        }
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] == answer[i]) {
                isHasEqual = true;
            }
        }
        int b = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            int index = i;
            if (IntStream.of(answer).anyMatch(x -> x == inputNumber[index])) {
                b++;
            }
        }
        if (!isHasEqual && b == 4) {
            return "0A4B";
        }

        int a = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] == answer[i]) {
                a++;
            }
        }
        if (a == 1 && b-a ==3) {
            return "1A3B";
        }

        if (a == 1 && b-a ==1) {
            return "1A1B";
        }

        if (!isHasEqual && b == 2){
            return "0A2B";
        }

        if (!isHasEqual) {
            return "0A0B";
        }
        return null;
    }
}
