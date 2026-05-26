package school.hei.demo.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.AddService;

@RestController
@AllArgsConstructor
public class AddController {
  private final AddService addService;

  @GetMapping("/add")
  public int add(int a, int b) {
    return addService.add(a, b);
  }
}
