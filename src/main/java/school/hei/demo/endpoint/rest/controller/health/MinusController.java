package school.hei.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.MinusService;

@RestController
public class MinusController {
  private final MinusService minusService;

  public MinusController(MinusService minusService) {
    this.minusService = minusService;
  }

  @GetMapping("/minus")
  public int divided(int a, int b) {
    return minusService.minus(a, b);
  }
}
