package jp.ac.ohara.seisaku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.ohara.seisaku.model.UserModel;

@Controller
public class UserController {
    @GetMapping("/user/")
    public ModelAndView add(UserModel usermodel, ModelAndView model) {
        model.addObject("usermodel", usermodel);
        model.setViewName("user");
        return model;
    }
}
