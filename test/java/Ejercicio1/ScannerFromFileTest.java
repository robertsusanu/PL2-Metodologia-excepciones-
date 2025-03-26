package Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScannerFromFileTest {

    @Test
    void main() {
        assertThrows(java.io.FileNotFoundException.class,()-> ScannerFromFile.main(null));
    }
}