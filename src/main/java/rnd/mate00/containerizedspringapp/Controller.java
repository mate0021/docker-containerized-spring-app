package rnd.mate00.containerizedspringapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    private String profileName;

    public Controller(@Value("${spring.profiles.active}") String profileName) {
        this.profileName = profileName;
    }

    @GetMapping("/greet")
    public String greet() {
        log.info("Greeting");
        log.debug("Greeting was called");
        return String.format("Hi from inside of container! Profile set: %s", profileName);
    }
}
