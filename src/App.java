import java.util.ArrayList;
import java.util.List;

public class App{

    public static List<Long> generateFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Число n должно быть натуральным (n >= 1).");
        }

        List<Long> fibonacciSequence = new ArrayList<>();
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciSequence.add(a);
            long next = Math.addExact(a, b); 
            a = b;
            b = next;
        }

        return fibonacciSequence;
    }

    public static void main(String[] args) {
        try {
            int n = 10; 
            List<Long> fibonacciNumbers = generateFibonacci(n);
            System.out.println("Первые " + n + " чисел Фибоначчи: " + fibonacciNumbers);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Ошибка вычислений: переполнение числового диапазона.");
        }
    }
}
