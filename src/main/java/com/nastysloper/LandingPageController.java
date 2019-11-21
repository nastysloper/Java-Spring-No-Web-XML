package com.nastysloper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LandingPageController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage() {
        return "index";
    }
}
