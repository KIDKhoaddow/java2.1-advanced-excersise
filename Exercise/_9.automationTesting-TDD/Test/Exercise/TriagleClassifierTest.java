package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriagleClassifierTest {

    @Test
    void checkTriagle() {
        double slice1=3;
        double slice2=4;
        double slice3=5;
        String expected="tam giác vuông";

        String result=TriagleClassifier.checkTriagle(slice1,slice2,slice3);
        assertEquals(expected,result);
    }
}