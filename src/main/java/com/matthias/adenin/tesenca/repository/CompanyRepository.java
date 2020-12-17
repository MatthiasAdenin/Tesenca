package com.matthias.adenin.tesenca.repository;

import com.matthias.adenin.tesenca.model.CompanyDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<CompanyDto,Long> {

}
