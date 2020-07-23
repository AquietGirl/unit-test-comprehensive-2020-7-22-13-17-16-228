package guessNumber;

import java.util.Arrays;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        boolean isHasEqual = false;
        if (Arrays.equals(inputNumber, answer)) {
            return "4A0B";
        }
        for (int i = 0; i< inputNumber.length;i++){
            if (inputNumber[i] == answer[i]){
                isHasEqual = true;
            }
        }
        if (!isHasEqual){
            return "0A0B";
        }
        return null;
    }
}
