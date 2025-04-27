package practice_10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    private final ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void testFindSecondMax_withNormalArrays() {
        // Проверка обычных массивов
        assertEquals(4, arrayUtils.findSecondMax(new int[]{1, 2, 3, 4, 5}), "Второе максимальное число должно быть 4");
        assertEquals(9, arrayUtils.findSecondMax(new int[]{10, 9, 8, 7, 6}), "Второе максимальное число должно быть 9");
        assertEquals(8, arrayUtils.findSecondMax(new int[]{5, 7, 17, 8}), "Второе максимальное число должно быть 7");
    }

    // Проверка пустого массива
    @Test
    void testFindSecondMax_withEmptyArray() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            arrayUtils.findSecondMax(new int[]{});
        });
        assertEquals("No value present", exception.getMessage(),
                "Исключение должно содержать сообщение 'No value present'");
    }

    // Проверка массива с одинаковыми числами
    @Test
    void testFindSecondMax_withIdenticalNumbers() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            arrayUtils.findSecondMax(new int[]{5, 5, 5});
        });
        assertEquals("No value present", exception.getMessage(),
                "Исключение должно содержать сообщение 'No value present'");
    }

    // Проверка массива с одним элементом
    @Test
    void testFindSecondMax_withSingleElement() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            arrayUtils.findSecondMax(new int[]{42});
        });
        assertEquals("No value present", exception.getMessage(),
                "Исключение должно содержать сообщение 'No value present'");
    }
}



