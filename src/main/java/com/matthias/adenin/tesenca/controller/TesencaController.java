package com.matthias.adenin.tesenca.controller;

import com.matthias.adenin.tesenca.model.CompanyDto;
import com.matthias.adenin.tesenca.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TesencaController {

    @Autowired
    CompanyRepository companyRepository;

    @PutMapping("/saveCompany")
    @CrossOrigin
    public CompanyDto saveCompany(@RequestBody CompanyDto companyDto) {
        return companyRepository.save(companyDto);
    }

    @GetMapping("/getCompanies")
    @CrossOrigin
    public List<CompanyDto> getCompanies() {
        List<CompanyDto> companyDtoList = new ArrayList<>();
        companyRepository.findAll().forEach(companyDtoList::add);
        return companyDtoList;
    }


}
