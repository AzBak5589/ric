package com.sgric.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.sgric.backend.model.HomePageContent;
import com.sgric.backend.model.ContactPageContent;
import com.sgric.backend.model.HelpUsPageContent;
import com.sgric.backend.services.HomePageContentService;
import com.sgric.backend.services.ContactPageContentService;
import com.sgric.backend.services.HelpUsPageContentService;

@Controller
public class AdminController {

    @Autowired
    private HomePageContentService homePageContentService;

    @Autowired
    private ContactPageContentService contactPageContentService;

    @Autowired
    private HelpUsPageContentService helpUsPageContentService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String adminPanel(Model model) {
        model.addAttribute("homePageContent", homePageContentService.getById(1L));
        model.addAttribute("contactPageContent", contactPageContentService.getById(1L));
        model.addAttribute("helpUsPageContent", helpUsPageContentService.getById(1L));
        return "adminPanel";
    }

    @PostMapping("/admin/saveHomeContent")
    public String saveHomeContent(HomePageContent content) {
        homePageContentService.save(content);
        return "redirect:/admin";
    }

    @PostMapping("/admin/saveContactContent")
    public String saveContactContent(ContactPageContent content) {
        contactPageContentService.save(content);
        return "redirect:/admin";
    }

    @PostMapping("/admin/saveHelpUsContent")
    public String saveHelpUsContent(HelpUsPageContent content) {
        helpUsPageContentService.save(content);
        return "redirect:/admin";
    }

}
