public class UserServiceImpl implements UserService{

    @Override
    public User createUser(String firstName, String lastName, String password, String repeatPassword) {
      return new User();
    }
}
