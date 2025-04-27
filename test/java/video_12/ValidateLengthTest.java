package video_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateLengthTest extends StringProcessorTest {
    /**
     * Позитивные сценарии
     *  "abba", 3 - > "abba"
     *  "abba", 4 -> "abba"
     *  Негативный сценарий
     *  "abba", 5 -> IllegalArgumentException
     *  Угловые кейсы
     *  "abba", 0 -> "abba"
     *  "", 0 -> ""
     *  "hello", -1 -> IllegalArgumentException
     */

    public static Stream<Arguments> stringForValidationPositiveCasec(){
        return Stream.of(
                Arguments.of("abba", 3),
                Arguments.of("abba", 4),
                Arguments.of("abba", 0),
                Arguments.of("", 0));
    }
    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCasec")
    public void userCanValidateStringWithLengthMoreOrEqualToMinValeu(String initialString, int minValue){
        String expectrdResult = stringProcessor.validateLength(initialString, minValue);

        assertEquals(expectrdResult, initialString);
    }
    public static Stream<Arguments> stringForValidationNegativeCases(){
        return Stream.of(
                Arguments.of("abba", 5),
                Arguments.of("hello", - 1));

    }

    @ParameterizedTest
    @MethodSource("stringForValidationNegativeCases")
    public void userCanNotValidateStringWithLengthLessThanMinValeu(String initialString, int minValue){

        assertThrows(IllegalArgumentException.class, () ->{
            stringProcessor.validateLength(initialString, minValue);
        },"Validation of String lenght ");

    }
}
