package com.quest.athene.webtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by roro_latrobe on 15/7/8.
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
