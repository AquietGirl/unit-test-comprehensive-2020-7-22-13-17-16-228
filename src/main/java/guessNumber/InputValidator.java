package guessNumber;

import java.util.HashSet;

public class InputValidator {

    public boolean isValidInputNumber(int[] inputNumber) {
        return inputNumber.length == 4 && isNotRepeat(inputNumber) && !isNumberOutOfRange(inputNumber);
    }

    private boolean isNotRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size() == array.length;
    }

    private boolean isNumberOutOfRange(int[] inputNumber) {
        for (int number : inputNumber) {
            if (number < 0 || number > 9){
                return true;
            }
        }
        return false;
    }
}
