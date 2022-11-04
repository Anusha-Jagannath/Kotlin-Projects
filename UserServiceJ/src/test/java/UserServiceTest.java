import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testCreateUserObject_whenUserDetailsProvided_shouldReturnUserObject() {
        //Arrange
        String firstName = "Anu";
        String lastName = "J";
        String password= "1234567";
        String repeatPassword = "1234567";
        UserService userService = new UserServiceImpl();

        //Act
        User user = userService.createUser(firstName,lastName,password,repeatPassword);

        //assert
    }
}
