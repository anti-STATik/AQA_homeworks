package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateUtilsLeapYear {
    private final DateUtils dateUtils = new DateUtils();

    // Проверка, что год високосный
    @Test
    void testIsLeapYearWithLeapYear(){
        assertTrue(dateUtils.isLeapYear(2020), "2020 является високосным");
    }

    // Проверка, что год не високосный
    @Test
    void testIsLeapYearWithNormalYear(){
        assertFalse(dateUtils.isLeapYear(2021), "2021 не является високосным");
    }

    // Проверка годов, которые делятся на 100, но не на 400
    @Test
    void testIsLeapYearWithDivisibleBy100ButNot400Year(){
        assertFalse(dateUtils.isLeapYear(1900), "1900 не является високосным");
        assertFalse(dateUtils.isLeapYear(2100), "2100 не является високосным");
    }

    // Проверка граничных случаев
    @Test
    void testIsLeapYearWithCornerCase(){
        assertTrue(dateUtils.isLeapYear(0), "0 является високосным");
        assertTrue(dateUtils.isLeapYear(4), "4 является високосным");
        assertTrue(dateUtils.isLeapYear(400), "400 является високосным");
    }
}
