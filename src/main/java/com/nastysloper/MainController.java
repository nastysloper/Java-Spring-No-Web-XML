package com.nastysloper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(path= "/greet/{name}",method=RequestMethod.GET)
    public ModelAndView greet(@PathVariable String name){
        ModelAndView modelAndView = new ModelAndView("greet");
        String message =" Hello, " + name + ". How are You?";
        modelAndView.addObject("message", message);
        System.out.println(message);
        return modelAndView;
    }
}
