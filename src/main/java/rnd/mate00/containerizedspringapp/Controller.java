package rnd.mate00.containerizedspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet")
    public String greet() {
        return "Hi from inside of container!";
    }
}
