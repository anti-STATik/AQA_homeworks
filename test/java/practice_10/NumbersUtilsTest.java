package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    // Проверка четных чисел
    @Test
    void testIsEvenWithEvenNumbers(){
        assertTrue(numberUtils.isEven(2), "2 должно быть четным");
    }

    // Проверка нечетных чисел
    @Test
    void testIsEvenWithOddNumbers(){
        assertFalse(numberUtils.isEven(1), "1 не должно быть четным");
    }

    // Проверка нуля
    @Test
    void testIsEvenWhithZero(){
        assertTrue(numberUtils.isEven(0), "0 должен быть четным");
    }

    // Проверка отрицательного чтеного числа
    @Test
    void testIsEvenWithNegativeEvenNumbers(){
        assertTrue(numberUtils.isEven(-2), "-2 должно быть четным");
    }

    // Проверка отрицательного нечтеного числа
    @Test
    void testIsEvenWithNegativeOddNumbers(){
        assertFalse(numberUtils.isEven(-3), "-3 должно быть нечетным");
    }
}
