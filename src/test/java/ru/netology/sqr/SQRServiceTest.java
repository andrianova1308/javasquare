package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @CsvSource (value = {"100,200,5","1,99,0","100,100,1","100,101,1","9799,9800,0","9802,9900,0","9801,9801,1"})
    @ParameterizedTest
    void shouldCalculate ( int limitBelow, int limitTop, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareNumber( limitBelow, limitTop);
        assertEquals( expected, actual);
    }
}