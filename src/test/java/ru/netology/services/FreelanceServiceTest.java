package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelanceService;

public class FreelanceServiceTest {

    @Test
    public void shouldCalcExact() {
        FreelanceService service = new FreelanceService();

        int expected = 2;
        int actual = service.calculate(100_000,60_000,150_000);

        Assertions.assertEquals(expected, actual);
    }
}
