import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class OrderClass1 {

    @BeforeAll
    static void setUp() {
        System.out.println("Setup1");
    }

    @Test
    void test1() {
        System.out.println("Running OrderClass1");
    }
}
