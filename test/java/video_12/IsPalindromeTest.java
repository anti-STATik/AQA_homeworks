package video_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest {

    /**
     * Тесты для проверки, является ли палиндромом:
     * Позитивные кейсы:
     * - четное кол-во: "abba" -> true
     * - нечетное кол-во: "hah" -> true
     * Негативные кейсы
     *  - "john" -> false
     * Корнер кейсы:
     * - "a" -> true
     * - "" -> true
     * - null - IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {
            // позитивные кейсы
            "abba", "hah",
            // корнер кейсы
            "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString){

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);

    }
    @Test
    public void userCanCheckIfValidStringIsNotPalindrome(){
        String initialString = "john";
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome(){
        StringProcessor stringProcessor = new StringProcessor();

        assertThrows(IllegalArgumentException.class, () ->{
            stringProcessor.reverse(null);
        },"Checking is Null string is palindrome lead to IllegalArgumentException");

    }
}
