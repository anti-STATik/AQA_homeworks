package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsCountWordsTest {
    private final StringUtils stringUtils = new StringUtils();

    // Проверка обычной строки
    @Test
    void testCountWordsWithNormalSentence(){
        assertEquals(3, stringUtils.countWords("Java is best"), "Обычная строка должна содержать правильное количество символов");
        assertEquals(5, stringUtils.countWords("Java mb is the best"), "Обычная строка должна содержать правильное количество символов");
    }
    // Проверка строки с несколькими пробелами
    @Test
    void testCountWordsWithMultipleSpace(){
        assertEquals(3, stringUtils.countWords("word1  word2 word3 "), "Строка с несколькими пробелами должна содержать 3 слова");
        assertEquals(0, stringUtils.countWords("   "), "Пустая строка с несколькими пробелами должна содержать 0 слов");
    }
    // Проверка пустой строки
    @Test
    void testCountWords_withEmptyString(){
        assertEquals(0, stringUtils.countWords(""), "Пустая строка должна содержать 0 слов");
    }

    // Проверка передачи null
    @Test
    void testCountWords_withNullInput(){
        Exception exception = assertThrows(NullPointerException.class, () ->{
            stringUtils.countWords(null);
        });
        assertEquals("Cannot invoke \"String.trim()\" because \"sentence\" is null", exception.getMessage(), "Исключение должно содержать сообщение о null");
    }
}
