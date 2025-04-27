package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsFactorialTest {

    private final MathUtils mathUtils = new MathUtils();

    // Проверка факториала нуля
    @Test
    void testFactorialWithZero(){
        assertEquals(1, mathUtils.factorial(0), "0! должен быть равен 1");
    }

    // Проверка факториала малых чисел
    @Test
    void testFactorialWithSmallNumbers(){
        assertEquals(1, mathUtils.factorial(1), "1! должен быть равен 1");
        assertEquals(120, mathUtils.factorial(5), "5! должен быть равен 120");
        assertEquals(5040, mathUtils.factorial(7), "7! должен быть равен 5040");
    }

    // Проверка исключения для отрицательных чисел
    @Test
    void testFactorialWithNegativeNumbers(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            mathUtils.factorial(-1);
        });
        assertEquals("Negative numbers not allowed", exception.getMessage(), "Сообщение должно содержать: Negative numbers not allowed");
    }
}
