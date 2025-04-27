package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsIsValidEmailTest {

    private final StringUtils stringUtils = new StringUtils();

    // Проверка корректных e-mail
    @Test
    void testIsValidEmailWithValidEmail(){
        assertTrue(stringUtils.isValidEmail("test@test.com"), "test@test.com должен быть валидным");
        assertTrue(stringUtils.isValidEmail("test123@test.com"), "test123@test.com должен быть валидным");
        assertTrue(stringUtils.isValidEmail("test@test.com.corp"), "test@test.com.corp должен быть валидным");
    }


    // Проверка некорректных e-mail
    @Test
    void testIsValidEmailWithInvalidEmail(){
        assertFalse(stringUtils.isValidEmail("bad@.com"), "bad@.com невалидный e-mail");
        assertFalse(stringUtils.isValidEmail("@bad.com"), "@bad.com невалидный e-mail");
        assertFalse(stringUtils.isValidEmail("bad.com"), "bad.com невалидный e-mail");
        assertFalse(stringUtils.isValidEmail("bad@"), "bad@ невалидный e-mail");
        assertFalse(stringUtils.isValidEmail("bad@badest.c"), "bad@badest.c невалидный e-mail");
    }


    // Проверка передачи null
    @Test
    void testIsValidEmailWithNullInput(){
        assertFalse(stringUtils.isValidEmail(null), "При null должно возвращаться false");
    }

    // Проверка передачи пустой строки
    @Test
    void testIsValidEmailWithEmptyInput(){
        assertFalse(stringUtils.isValidEmail(""), "Пустая строка не должна быть валидной");
    }
}
