package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int number =15;
        String expected="FizzBuzz";

        String result=FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
}