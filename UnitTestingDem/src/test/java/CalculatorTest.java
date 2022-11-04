import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;


@DisplayName("Test math operation")
public class CalculatorTest {

    //test<System under test_<condition>_<result>
    @DisplayName("4 divided by zero")
    @Test
    void testIntegerDivision_WhenDivisorIsValidInteger_ReturnsTwo() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.integerDivision(4,2);
        Assertions.assertEquals(2,actualResult,"4/2 did not yield 2");
        Assertions.assertNotEquals(2,actualResult);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }

    @DisplayName("division exception")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        fail("Not implemeted");
    }

    @DisplayName("subtraction test")
    @Test
    void integerSubtractionTest() {
        Calculator calculator = new Calculator();
        int minuend = 4;
        int subtrahend = 2;
        int expectedResult = 2;
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        Assertions.assertEquals(expectedResult,actualResult,()-> minuend+"-"+subtrahend+" didnot produce "+expectedResult);
    }
}
