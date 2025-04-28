import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testSetAndGetEmail() {
        Customer customer = new Customer("John Doe");
        customer.setEmail("john@example.com");
        assertEquals("john@example.com", customer.getEmail());
    }
}
