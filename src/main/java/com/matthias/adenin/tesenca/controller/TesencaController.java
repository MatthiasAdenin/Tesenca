package com.matthias.adenin.tesenca.controller;

import com.matthias.adenin.tesenca.model.CompanyDto;
import com.matthias.adenin.tesenca.repository.CompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TesencaController {

    Logger LOGGER = LoggerFactory.getLogger(TesencaController.class);

    @Autowired
    CompanyRepository companyRepository;

    @PutMapping("/saveCompany")
    public CompanyDto saveCompany(@RequestBody CompanyDto companyDto) {
        return companyRepository.save(companyDto);
    }

    @GetMapping("/getCompanies")
    public List<CompanyDto> getCompanies() {
        LOGGER.info("START - Retrieve getCompanies");
        List<CompanyDto> companyDtoList = new ArrayList<>();
        companyRepository.findAll().forEach(companyDtoList::add);
        LOGGER.info("END - Retrieve getCompanies");
        return companyDtoList;
    }


}
