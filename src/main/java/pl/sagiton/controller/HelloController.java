package pl.sagiton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sagiton.repository.UserService;

/**
 * Created by szymon on 22.02.16.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }

    @RequestMapping(value = "/wrong", method = RequestMethod.GET)
    public String wrongPasswordPage(){
        return "wrong";
    }

}
