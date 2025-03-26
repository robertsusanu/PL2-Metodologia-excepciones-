package Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackDemoTest {


    @Test
    void methodA() {
        assertDoesNotThrow(() -> MethodCallStackDemo.methodA());
    }

    @Test
    void methodB() {
        assertDoesNotThrow(() -> MethodCallStackDemo.methodB());
    }

    @Test
    void methodC() {
        assertDoesNotThrow(() -> MethodCallStackDemo.methodC());
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStackDemo.main(null));
    }

}