package dev.loganholt.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String listVets(Model model) {
        return "vets/index";
    }
}
