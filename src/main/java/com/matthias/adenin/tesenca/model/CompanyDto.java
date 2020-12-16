package com.matthias.adenin.tesenca.model;

import lombok.*;

@NoArgsConstructor
@Builder
@Data
@Getter
public class CompanyDto {
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


}
