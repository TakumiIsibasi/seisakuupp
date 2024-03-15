package jp.ac.ohara.seisaku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.ohara.seisaku.model.NikkiModel;
import jp.ac.ohara.seisaku.service.NikkiService;

@Controller
public class NikkiController {

    @Autowired
    private NikkiService nikkiService;

    @GetMapping("/nikki/")
    public ModelAndView addForm(ModelAndView model) {
        model.addObject("nikkiModel", new NikkiModel());
        model.setViewName("nikki");
        return model;
    }

    @PostMapping("/confirm")
    public String confirm(@ModelAttribute("nikkiModel") NikkiModel nikkiModel, BindingResult result) {
        if (result.hasErrors()) {
            return "nikki";
        }
        nikkiService.saveNikki(nikkiModel);
        return "redirect:/nikkihyou/";
    }

    @PostMapping("/nikki/delete/{id}")
    public String deleteNikki(@PathVariable Long id) {
        nikkiService.deleteNikki(id);
        return "redirect:/nikkihyou/";
    }
}
