package guessNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void should_return_true_when_input_number_is_valid() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        InputValidator inputValidator = new InputValidator();

        //when
        boolean result = inputValidator.isValidInputNumber(inputNumber);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_input_number_length_is_shorter_than_4() {
        //given
        int[] inputNumber = {1, 9};
        InputValidator inputValidator = new InputValidator();

        //when
        boolean result = inputValidator.isValidInputNumber(inputNumber);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void should_return_false_when_input_number_length_is_longer_than_4() {
        //given
        int[] inputNumber = {1, 2, 3, 4, 5, 6, 7};
        InputValidator inputValidator = new InputValidator();

        //when
        boolean result = inputValidator.isValidInputNumber(inputNumber);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void should_return_false_when_input_number_has_repeat_number() {
        //given
        int[] inputNumber = {1, 1, 3, 4};
        InputValidator inputValidator = new InputValidator();

        //when
        boolean result = inputValidator.isValidInputNumber(inputNumber);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void should_return_false_when_input_number_out_of_range() {
        //given
        int[] inputNumber = {-1, 11, 3, 4};
        InputValidator inputValidator = new InputValidator();

        //when
        boolean result = inputValidator.isValidInputNumber(inputNumber);

        //then
        Assertions.assertFalse(result);
    }
}