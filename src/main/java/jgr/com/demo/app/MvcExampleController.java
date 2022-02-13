package jgr.com.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcExampleController {

    @GetMapping("/home")
    public String init() {
        return "index";
    }
    
    
}
