import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorDemoRepeatedTests {

    Demo demo;

    @BeforeEach
    void setUp() {
        demo = new Demo();
    }

    @DisplayName("Division by zero")
    //@RepeatedTest(3)
    @RepeatedTest(value = 3, name = "{displayName}.Repetition {currentRepetition} of "+"{totalRepetitions}")
    void testIntegerDivision_WhenDividendDividedByZero_ShouldThrowArithmeticException
            (RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Current repetition number " + repetitionInfo.getCurrentRepetition());
        System.out.println("Repetition number " + repetitionInfo.getTotalRepetitions());
        System.out.println("Test info "+testInfo.getDisplayName());
        System.out.println("Test info"+testInfo.getTestMethod().get().getName());
        //arrange
        int divident = 10;
        int divisor = 0;
        String expectedMessage = "/ by zero";
        //act
        ArithmeticException actualMessage = assertThrows(ArithmeticException.class, () -> {
            demo.integerDivision(divident, divisor);
        }, "division by zero should have thrown arithmetic exception");

        //assert
        assertEquals(expectedMessage, actualMessage.getMessage(), "assertion failed");

    }
}
