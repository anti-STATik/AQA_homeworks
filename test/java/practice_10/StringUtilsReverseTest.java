package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsReverseTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    // Проверка обычных строк
    void testReverseWithNormalStrings(){
        assertEquals("olleh", stringUtils.reverse("hello"), "Строка должна быть перевернута в olleh");
        assertEquals("avaj", stringUtils.reverse("java"), "Строка должна быть перевернута в avaj");
        assertEquals("54321", stringUtils.reverse("12345"), "Строка должна быть перевернута в 54321");
    }
    @Test
    // Проверка пустой строки
    void testReverseWithEmptyString(){
        assertEquals("", stringUtils.reverse(""), "Пустая строка должна быть пустой");
    }

    @Test
    // Проверка null строки
    void testReverseWithNullInput(){
        assertNull(stringUtils.reverse(null), "Должно возвращаться null");
    }

}
