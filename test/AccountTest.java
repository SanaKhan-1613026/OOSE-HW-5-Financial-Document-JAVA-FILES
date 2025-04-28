import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccountCreation() {
        Account account = new Account("ACC12345");
        assertEquals("ACC12345", account.getAccountNumber());
    }

    @Test
    public void testSetAndGetBalance() {
        Account account = new Account("ACC12345");
        account.setBalance(500.0);
        assertEquals(500.0, account.getBalance());
    }
}
