package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test

    void oneSQ () {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.squares(200, 300);
        assertEquals(expected, actual);
    }


    @Test
    void twoSQ () {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.squares(200, 400);
        assertEquals(expected, actual);
    }
    @Test
    void threeSQ () {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.squares(200, 500);
        assertEquals(expected, actual);
    }
}
