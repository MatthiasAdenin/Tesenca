package com.matthias.adenin.tesenca.controller;

import com.matthias.adenin.tesenca.model.CompanyDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesencaController {

    @PutMapping("/saveCompany")
    public boolean saveCompany(@RequestBody CompanyDto companyDto) {
        return false;
    }

}
