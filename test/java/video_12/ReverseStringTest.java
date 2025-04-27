package video_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {
    /**
     * Тесты для переворота строки:
     * happy path: "sasha" -> "ahsas"
     * corner cases:
     * "" -> ""
     * "a" -> "a"
     * null -> IllegalArgument Exception
     */

    public static Stream<Arguments> validStringsToReverse(){
        return Stream.of(
                // happy path: "sasha" -> "ahsas"
                Arguments.of("sasha", "ahsas"),
                // corner cases: "" -> ""
                Arguments.of("", ""),
                // corner cases: "a" -> "a"
                Arguments.of("a", "a"));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        StringProcessor stringProcessor = new StringProcessor();

        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString, "String reversed incorrectly!!!");
    }
    @Test
    public void userCannotReverseNullString(){
        StringProcessor stringProcessor = new StringProcessor();

        assertThrows(IllegalArgumentException.class, () ->{
            stringProcessor.reverse(null);
            },"Reversing of null string should lead to IllegalArgumentException");

    }


}


