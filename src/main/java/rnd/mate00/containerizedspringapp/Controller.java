package rnd.mate00.containerizedspringapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private String profileName;

    public Controller(@Value("${spring.profiles.active}") String profileName) {
        this.profileName = profileName;
    }

    @GetMapping("/greet")
    public String greet() {
        return String.format("Hi from inside of container! Profile set: %s", profileName);
    }
}
