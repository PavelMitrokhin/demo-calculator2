package byITAcademyMPAcalculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void sum1() {
        Assertions.assertEquals(3.6, new Calculator().sum(1.3,2.3), 0.0001);
    }
}
