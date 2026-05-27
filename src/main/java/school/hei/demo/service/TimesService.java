package school.hei.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TimesService {
    public int times(int a, int b){
        return a * b;
    }
}
