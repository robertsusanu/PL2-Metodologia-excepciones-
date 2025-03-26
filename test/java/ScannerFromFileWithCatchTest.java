import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScannerFromFileWithCatchTest {

    @Test
    void main() {
        assertThrows(java.io.FileNotFoundException.class, () -> ScannerFromFileWithCatch.main(null));
    }
}