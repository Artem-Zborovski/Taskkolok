import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class JavaTest {

    @Test
    void testGenerateFibonacci_ValidInput() {
        List<Long> result = App.generateFibonacci(5);
        assertEquals(List.of(0L, 1L, 1L, 2L, 3L), result, "Результат для n=5 некорректен.");
    }

    @Test
    void testGenerateFibonacci_SingleNumber() {
        List<Long> result = App.generateFibonacci(1);
        assertEquals(List.of(0L), result, "Результат для n=1 некорректен.");
    }

    @Test
    void testGenerateFibonacci_LargeInput() {
        List<Long> result = App.generateFibonacci(10);
        assertEquals(List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L), result, "Результат для n=10 некорректен.");
    }

    @Test
    void testGenerateFibonacci_InvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> App.generateFibonacci(0));
        assertEquals("Число n должно быть натуральным (n >= 1).", exception.getMessage());
    }

    @Test
    void testGenerateFibonacci_Overflow() {
        assertThrows(ArithmeticException.class, () -> App.generateFibonacci(93));
    }
}
