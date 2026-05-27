package school.hei.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TimesServiceTest {
    @Autowired
    private TimesService timesService;

    @Test
    void times_two_positive_numbers_ok() {
        assertEquals(4, timesService.times(2, 2 ));
    }

    @Test
    void times_two_negative_numbers_ok() {
        assertEquals(-63,  timesService.times(9, -7 ));
    }

    @Test
    void times_two_negative_numbers_ko() {
        assertEquals(-63,  timesService.times(-6, -7 ));
    }
}