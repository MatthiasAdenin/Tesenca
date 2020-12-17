package com.matthias.adenin.tesenca.controller;

import com.matthias.adenin.tesenca.model.CompanyDto;
import com.matthias.adenin.tesenca.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesencaController {

    @Autowired
    CompanyRepository companyRepository ;
    @PutMapping("/saveCompany")
    public CompanyDto saveCompany(@RequestBody CompanyDto companyDto) {
        return companyRepository.save(companyDto);
    }

}
