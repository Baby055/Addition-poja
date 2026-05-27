package school.hei.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.DividedService;

@RestController
public class DividedController {
  private final DividedService dividedService;

  public DividedController(DividedService dividedService) {
    this.dividedService = dividedService;
  }

  @GetMapping("/divided")
  public int divided(int a, int b) {
    return dividedService.divided(a, b);
  }
}
