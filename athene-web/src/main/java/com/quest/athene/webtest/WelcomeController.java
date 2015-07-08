package com.quest.athene.webtest;

import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by roro_latrobe on 15/7/8.
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/questions/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> listData(@PathVariable Long userId) {
        List<Question> questions = questionService.findQuestionsByAuthorId(userId);
        return questions;
    }
}
