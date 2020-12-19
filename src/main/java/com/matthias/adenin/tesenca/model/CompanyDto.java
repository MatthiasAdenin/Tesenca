package com.matthias.adenin.tesenca.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CompanyDto {

    @Id
    @GeneratedValue
    private Long id;

    public String taille;
    public String nom;
    public String dirigeant;
    public String adresse;
    public String pays;
    public String devise;
    public String telephone;
    public String webSite;
    public String numSiret;
    public String formeJuridique;
    public String numSiren;
    public String nombreEmployee;
    public String email;


}
