package SpringBootStart.SpringBootFirstProject.Controller;
import SpringBootStart.SpringBootFirstProject.UserFiles.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
     UserDaoService service;

    @RequestMapping(value = "/users/address", method = RequestMethod.GET)
    public List<String> getUserList(){
        return service.getAddress();

    }
}
