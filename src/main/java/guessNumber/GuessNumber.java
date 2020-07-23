package guessNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {

        if (inputNumber.length != 4) {
            return "Wrong Input,Input again";
        }

        if (!isNotRepeat(inputNumber)) {
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

    public boolean isNotRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size() == array.length;
    }
}
