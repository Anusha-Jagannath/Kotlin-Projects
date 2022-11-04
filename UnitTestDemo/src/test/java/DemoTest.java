import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Test for math operations for calculator")
class DemoTest {

    Demo demo;
    @BeforeAll
    static void setUp() {
       System.out.println("Executing @before all testcases") ;
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("Executes @after all testcases");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        demo = new Demo();
        System.out.println("Executes @beforeEach");
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executes after each test method");
    }


    @Test
    void demoTest() {
        System.out.println("Running demo test");
    }

    @Test
    void integerDivision() {
        Demo demo = new Demo();
        int result = demo.integerDivision(4,2);
        assertEquals(2, result,"4/2 didnot produce actual result");
    }

    @Disabled("TODO ; build fauili")
    @DisplayName("4/2 division test")
    @Test
    void testIntegerDivision_WhenFourDividedByTwo_ShouldReturnTWo() {
        Demo demo = new Demo();
        int result = demo.integerDivision(4,2);
        assertEquals(2, result,"4/2 didnot produce actual result");
    }

    @DisplayName("Division by zero")
    @Test
    void testIntegerDivision_WhenDividentDividedByZero_ShouldThrowArithmeticException() {
       //arrange
        int divident = 10;
        int divisor = 2;
        String expectedMessage = "/ by zero";
        //act
        ArithmeticException actualMessage = assertThrows(ArithmeticException.class,() -> {
            demo.integerDivision(divident,divisor);
        },"division by zero should have thrown arithmetic exception");

        //assert
        assertEquals(expectedMessage,actualMessage.getMessage(),"assertion failed");

    }

    @ParameterizedTest
    @ValueSource(strings = {"John","Pie","Alb"})
    void valueSourceDemonstration(String firstName) {
        assertNotNull(firstName);
    }

    @ParameterizedTest
    //@MethodSource("integerSubtractionInputParameters")
    //@CsvSource({"33,1,32","24,1,23","54,1,53"})
    //@CsvSource({"apple,orange","apple,''","apple,"})
    @CsvFileSource(resources = "/integerSubtraction.csv")
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        Demo  demo = new Demo();
        int result = demo.integerSubtraction(minuend,subtrahend);
        assertEquals(expectedResult, result,()->"minuend - subtrahend did not produce required result");
    }

    private static Stream<Arguments> integerSubtractionInputParameters() {
        return Stream.of(
            Arguments.of(33,1,32),
                Arguments.of(24,1,23),
                Arguments.of(54,1,53)
        );
    }
}