package school.hei.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinusServiceTest {
  @Autowired private MinusService minusService;

  @Test
  void two_numbers_minus_ok() {
    assertEquals(2, minusService.minus(4, 2));
  }
}
