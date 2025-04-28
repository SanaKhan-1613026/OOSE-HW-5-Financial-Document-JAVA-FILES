import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccountNumber() {
        Account account = new Account("12345");
        assertEquals("12345", account.getAccountNumber());
    }
}
