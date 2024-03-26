package com.sgric.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "demande_adhesion")
@Entity
public class DemandeAdhesion extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dem", columnDefinition = "serial", updatable = false)
    private Long idDemAdh;

    @Column(name = "nom_dem")
    private String nomDemAdh;

    @Column(name = "prenom_dem")
    private String prenomDemAdh;

    @Column(name = "genrem_dem")
    private boolean genreMDemAdh;

    @Column(name = "profession_dem")
    private String professionDemAdh;

    @Column(name = "entreprise_dem")
    private String entrepriseDemAdh;

    @Column(name = "telephone_dem")
    private String telephoneDemAdh;

    @Column(name = "email_dem")
    private String emailDemAdh;

    @Column(name = "message_dem")
    private String messageDemAdh;

}
