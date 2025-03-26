import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
class ScannerFromFileTest {

    @Test
    void main() {
        assertThrows(java.io.FileNotFoundException.class,()->ScannerFromFile.main(null));
    }
}