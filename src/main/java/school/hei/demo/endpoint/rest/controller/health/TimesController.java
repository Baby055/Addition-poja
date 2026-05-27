package school.hei.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.TimesService;

@RestController
public class TimesController {
  private final TimesService timesService;

  public TimesController(TimesService timesService) {
    this.timesService = timesService;
  }

  @GetMapping("/times")
  public int times(int a, int b) {
    return timesService.times(a, b);
  }
}
