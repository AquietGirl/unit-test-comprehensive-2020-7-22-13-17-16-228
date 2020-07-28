package guessNumber;

import java.util.stream.IntStream;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String getGameResult(int[] inputNumber) {
        int countA = 0, countB = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] == answer[index]) {
                countA++;
            } else {
                int finalIndex = index;
                if (IntStream.of(answer).anyMatch(x -> x == inputNumber[finalIndex])) {
                    countB++;
                }
            }
        }
        return countA + "A" + countB + "B";
    }


}
