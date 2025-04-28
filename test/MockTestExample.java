import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockTestExample {

    @Test
    public void testDownloadDocumentWithMock() {
        // Create a mock of DocumentService
        DocumentService docService = mock(DocumentService.class);

        // Define mock behavior
        when(docService.downloadDocument("tax2023")).thenReturn("PDF Document Content");

        // Call the mocked method
        String result = docService.downloadDocument("tax2023");

        // Verify the mock behavior
        assertEquals("PDF Document Content", result);

        // Optional: Verify that the method was called once
        verify(docService, times(1)).downloadDocument("tax2023");
    }
}
