object RegisterUtil {

    private val existingUser = listOf<String>("Peter","karl")
    /**
     * input is not valid if
     * username/password is empty
     * username is already taken
     * confirm password is not equal to real password
     * password contains less than 2 digits
     */
    fun registerUser(userName: String, password: String, confirmPassword: String): Boolean {
        if (userName.isEmpty() || password.isEmpty())
            return false
        if (userName in existingUser)
            return false
        if (password != confirmPassword)
            return false
        if (password.length <= 2 || confirmPassword.length <= 2)
            return false
        return true
    }
}