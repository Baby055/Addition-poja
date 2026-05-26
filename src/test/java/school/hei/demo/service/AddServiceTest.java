package school.hei.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddServiceTest {
  private final AddService addService = new AddService();

  @Test
  void add_two_positive_numbers_ok() {
    assertEquals(3, addService.add(1, 2));
  }

  @Test
  void add_two_negative_numbers_ok() {
    assertEquals(-5, addService.add(-2, -3));
  }
}
