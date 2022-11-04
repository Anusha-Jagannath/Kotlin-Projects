import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(3)
public class OrderClass3 {
    @BeforeAll
    static void setUp3() {
        System.out.println("Setup3");
    }

    @Test
    void test3() {
        System.out.println("Running OrderClass3");
    }
}
