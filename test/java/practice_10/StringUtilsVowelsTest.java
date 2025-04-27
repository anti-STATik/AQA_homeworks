package practice_10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsVowelsTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    // Проверка строк с гласными буквами
    void testCountVowelswhisVowels(){
        assertEquals(2, stringUtils.countVowels("hello"), "В слове hello 2 гласные буквы");
        assertEquals(2, stringUtils.countVowels("java"), "В слове java 2 гласные буквы");
        assertEquals(6, stringUtils.countVowels("AEIOUY"), "В слове AEIOUY 6 гласных букв");
    }

    @Test
    // Проверка строк без гласных букв
    void testCountVowelsWithoutVowels(){
        assertEquals(0, stringUtils.countVowels("bsdlw"), "В строке bsdlw 0 гласных букв");
        assertEquals(0, stringUtils.countVowels("1234"), "В строке 1234 0 гласных букв");
        assertEquals(0, stringUtils.countVowels(";№"), "В строке ;№ 0 гласных букв");
    }

    @Test
    // Проверка пустой строки
    void testCountVowelsWhisEmptyString(){
        assertEquals(0, stringUtils.countVowels(""), "В пусто строке 0 гласных букв");
    }

    @Test
    // Проверка передачи null
    void testCountVoweldWithNullInput(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.countVowels(null);
        });
        assertEquals("Input cannot be null", exception.getMessage(), "Исключение: Input cannot be null");
    }
}
