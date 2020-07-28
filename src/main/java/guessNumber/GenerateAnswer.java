package guessNumber;

import java.util.Random;

public class GenerateAnswer implements IGenerate{
    public int[] generate() {
        int length = 4;
        int[] result = new int[length];
        int count = 0;
        while (count < length) {
            Random r = new Random();
            int num = r.nextInt(10);
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }

}
