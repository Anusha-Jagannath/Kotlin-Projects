import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(2)
public class OrderClass2 {
    @BeforeAll
    static void setUp2() {
        System.out.println("Setup2");
    }


    @Test
    void test2() {
        System.out.println("Running OrderClass2");
    }
}
