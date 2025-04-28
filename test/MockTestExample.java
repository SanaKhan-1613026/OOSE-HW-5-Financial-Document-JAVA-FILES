import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockTestExample {

    @Test
    public void testDownloadDocumentWithMock() {
        DocumentService docService = mock(DocumentService.class);
        when(docService.downloadDocument("tax2023")).thenReturn("PDF Content");

        String result = docService.downloadDocument("tax2023");
        assertEquals("PDF Content", result);
    }
}
