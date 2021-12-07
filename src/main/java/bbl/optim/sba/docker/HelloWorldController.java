package bbl.optim.sba.docker;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() {
        return "Hello from you !!!!";
    }

    @RequestMapping("/{name}")
    public String helloByName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
