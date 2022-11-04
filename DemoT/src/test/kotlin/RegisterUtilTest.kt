import org.junit.Assert
import org.junit.Test

class RegisterUtilTest {

    @Test
    fun whenUserNameIsEmpty_returnsFalse() {
        val result = RegisterUtil.registerUser("","1234","1234")
        Assert.assertFalse(result)
    }

    @Test
    fun whenPasswordMismatch_returnsFalse() {
        val result = RegisterUtil.registerUser("Anu","1234","12346")
        Assert.assertFalse(result)
    }

    @Test
    fun whenUserNameAlreadyTaken_returnsFalse() {
        val result = RegisterUtil.registerUser("karl","1234","1234")
        Assert.assertFalse(result)
    }

    @Test
    fun whenPasswordLengthLessThanTwo_returnsFalse() {
        val result = RegisterUtil.registerUser("Kar","12","12")
        Assert.assertFalse(result)
    }
}