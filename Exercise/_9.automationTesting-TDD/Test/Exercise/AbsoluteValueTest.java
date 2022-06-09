package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueTest {

    @Test
    void findAbolute() {
        int number=0;
        int expected=0;

        int result = AbsoluteValue.findAbolute(number);
        assertEquals(expected,result);
    }
}