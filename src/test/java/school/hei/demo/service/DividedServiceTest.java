package school.hei.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DividedServiceTest {
  @Autowired private DividedService dividedService;

  @Test
  void divided_two_numeber_ok() {
    assertEquals(dividedService.divided(4, 2), 2);
  }

  @Test
  void divided_two_numeber_ko() {
    assertEquals(dividedService.divided(4, 3), 3);
  }
}
