package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsIsValidPhoneNumberTest {
    private final StringUtils stringUtils = new StringUtils();

    // Проверка корректных номеров
    @Test
    void testIsValidPhoneNumberWithValidNumbers() {
        assertTrue(stringUtils.isValidPhoneNumber("+8 9606580000"), "Номер +8 9606580000 должен быть валидным");
        assertTrue(stringUtils.isValidPhoneNumber("+80 9606580000"), "Номер +80 9606580000 должен быть валидным");
        assertTrue(stringUtils.isValidPhoneNumber("+800 9606580000"), "Номер +800 9606580000 должен быть валидным");
    }

    // Проверка некорректных номеров
    @Test
    void testIsValidPhoneNumberWithInValidNumbers(){
        assertFalse(stringUtils.isValidPhoneNumber("+1234"), "+1234 не доложен быть валидным");
        assertFalse(stringUtils.isValidPhoneNumber("+ABC"), "+ABC не доложен быть валидным");
        assertFalse(stringUtils.isValidPhoneNumber("+++"), "+++ не доложен быть валидным");
        assertFalse(stringUtils.isValidPhoneNumber(""), "'' не доложен быть валидным");
    }
    // Проверка передачи null
    @Test
    void testIsValidPhoneNumberWithNullInput(){
        Exception exception = assertThrows(NullPointerException.class, () ->{
            stringUtils.isValidPhoneNumber(null);
        });
        assertEquals("Cannot invoke \"String.matches(String)\" because \"phone\" is null", exception.getMessage(), "Исключение должно содержать null");
    }
}