package jgr.com.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import lombok.extern.slf4j.Slf4j;

@RestController
// @Slf4j
public class RestExampleController {

    @GetMapping("/")
    public String init() {
        // log.debug("Hello debug");
        // log.info("Hello info");
        return "Hello world with Spring";
    }

    /*
    route("/api/cosa", cosaRouter)
    route("/api/cosa2, cosa2Router")
    route("/api/cosa3, cosa3Router")

    */
    
}
