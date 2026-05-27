package school.hei.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DividedService {
  public int divided(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a et b doivent être positif");
    }
    return a / b;
  }
}
