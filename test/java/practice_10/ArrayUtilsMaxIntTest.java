package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsMaxIntTest {
    private final ArrayUtils arrayUtils = new ArrayUtils();

    @Test
        // Проверка обычного массива
    void testFindMaxWithNormalArray() {
        int[] numbers = {1, 2, 5, 10};
        assertEquals(10, arrayUtils.findMax(numbers), "Максимальное число 10");
    }

    @Test
        // Проверка массива с одним элементом
    void testFindMaxWithOneElement() {
        int[] numbers = {50};
        assertEquals(50, arrayUtils.findMax(numbers), "Максимальное число 50");
    }

    @Test
        // Проверка массива с отрицательными числами
    void testFindMaxWithNegativeNambers() {
        int[] numbers = {-1, -2, -5, -10};
        assertEquals(-1, arrayUtils.findMax(numbers), "Максимальное число -1");
    }


    @Test
        // Проверка пустого массива
    void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        Exception exception = assertThrows(RuntimeException.class, () ->{
            arrayUtils.findMax(numbers);
        });
        assertEquals("No value present", exception.getMessage(), "No value");
    }
}


