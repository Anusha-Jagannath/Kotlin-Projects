import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest {

    @Test
    fun testIntegerDivision_whenValidValuesPasses_shouldReturnExpectedResult() {
        val calculator = Calculator()
        val result = calculator.integerDivision(4,2)
        assertEquals(2,result)
    }

    @Test
    fun testIntegerDivision_whenInvalidValuesPasses_shouldReturnExpectedResult() {
        val calculator = Calculator()
        val result = calculator.integerDivision(5,2)
        assertEquals(10,result)
    }
}