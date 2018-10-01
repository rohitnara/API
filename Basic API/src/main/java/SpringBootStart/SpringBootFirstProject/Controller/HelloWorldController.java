package SpringBootStart.SpringBootFirstProject.Controller;

import SpringBootStart.SpringBootFirstProject.UserFiles.helloWorldBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public helloWorldBean helloWorldFunction(){
        return new helloWorldBean("Hello Rohit Narayan");
    }
}
