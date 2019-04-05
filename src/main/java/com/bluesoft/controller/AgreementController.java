package com.bluesoft.controller;

import com.bluesoft.model.Agreement;
import com.bluesoft.repository.AgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("agreement")
public class AgreementController {

    @Autowired
    private AgreementRepository agreementRepository;

    @RequestMapping("all")
    public String getAllAgreements(Model model) {
        List<Agreement> agreements = agreementRepository.findAll();
        model.addAttribute("agreements", agreements);
        return "agreements";
    }
}
