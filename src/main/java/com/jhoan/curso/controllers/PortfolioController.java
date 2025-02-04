package com.jhoan.curso.controllers;



import com.jhoan.curso.model.PersonalInfo;
import com.jhoan.curso.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/")
    public String home(Model model) {
        PersonalInfo info = infoService.getPersonalInfo();
        model.addAttribute("info", info);
        return "index";
    }
}