package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void calculateNextDay() {
        int day =31;
        int month=12;
        int year =2020;
        String expected = "year : 2021, month : 1, day : 1";

        String result =NextDayCalculator.CalculateNextDay(day,month,year);
        assertEquals(expected,result);
    }
}