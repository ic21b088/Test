package at.fhtw.Test.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    private final TestService service = new TestService();

    @Test
    void getSquare() {
        assertEquals(100,service.getSquare(10));
    }

    @Test
    void testSum()
    {
        service.addToSum(5);
        assertEquals(5,service.getSumme());
    }

    @Test
    void testMoreSum()
    {
        service.addToSum(10);
        service.addToSum(25);
        service.addToSum(-10);
        assertEquals(25,service.getSumme());
    }



}