package org.example.bootjsp.controller;

import org.springframework.ui.Model;
import org.example.bootjsp.model.dto.RealEstate;
import org.example.bootjsp.model.repository.RealEstateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    private final RealEstateRepository realEstateRepository;

    public MainController(RealEstateRepository realEstateRepository) {
        this.realEstateRepository = realEstateRepository;
    }

    @GetMapping
    public String index(Model model) {
        List<RealEstate> data = realEstateRepository.findAll();
        model.addAttribute("model", data);
        return "index";
    }

    @PostMapping
    public String add() {
        realEstateRepository.save(realEstate);
                return "redirect:/";
    }
}
