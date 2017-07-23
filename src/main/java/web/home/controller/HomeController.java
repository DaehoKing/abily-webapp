package web.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by User on 2017-07-16.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
