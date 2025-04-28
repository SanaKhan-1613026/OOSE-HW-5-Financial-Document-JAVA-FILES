import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockTestExample {

    @Test
    public void testMockPaymentInfo() {
        // Create a mock of PaymentInfo
        PaymentInfo mockPayment = mock(PaymentInfo.class);

        // Define behavior: when validateCard() is called, return true
        when(mockPayment.validateCard()).thenReturn(true);

        // Define behavior: when makePayment() is called, return true
        when(mockPayment.makePayment()).thenReturn(true);

        // Call mocked methods
        boolean isCardValid = mockPayment.validateCard();
        boolean paymentStatus = mockPayment.makePayment();

        // Assertions
        assertTrue(isCardValid);
        assertTrue(paymentStatus);

        // Verify interactions
        verify(mockPayment, times(1)).validateCard();
        verify(mockPayment, times(1)).makePayment();
    }
}
