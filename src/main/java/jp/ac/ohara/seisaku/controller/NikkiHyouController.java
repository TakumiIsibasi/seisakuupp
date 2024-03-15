package jp.ac.ohara.seisaku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.ac.ohara.seisaku.service.NikkiService;

@Controller
public class NikkiHyouController {

    @Autowired
    private NikkiService nikkiService;

    @GetMapping("/nikkihyou/")
    public String index(Model model) {
        model.addAttribute("nikkiList", nikkiService.getNikkiList());
        return "nikkihyou";
    }
}
