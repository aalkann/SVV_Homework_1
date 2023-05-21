/**
 * Student id : B211202378
 * Name : Ahmet
 * Surname : Alkan
 * Course Name : Software Verification And Validation
 * Homework Number : 1
 * Repository Address: https://github.com/ahmetmurat21/SVV_Homework_1/blob/master/src/test/java/CalculatorTest.java
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    /*
        I used CsvSource annotation to perform this task
        divide method will run for each row of Csv structure
     */
    @ParameterizedTest
    @DisplayName("Calculator Division Test")
    @CsvSource({
            "10.   , 2.   , 5. "  ,
            "10.   , 4.   , 2.5",
            "12.5  , 5.   , 2.5",
            "10.   , 2.5 ,  4. "  ,
            "12.5  , 2.5 ,  5. "})
    void divide(double a ,double b, double expectedResult) {
        // Here we simply check whether the output of Calculator.divide function is equal to expectedResult
        assertEquals(expectedResult,Calculator.divide(a,b));
    }

}