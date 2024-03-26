package com.sgric.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @LastModifiedBy
    @Column(name = "modifier_par", nullable = false)
    protected String modifierPar;

    @LastModifiedDate
    @Column(name = "date_modification", nullable = false)
    protected Date dateModification;

    @CreatedDate
    @Column(name = "date_creation", nullable = false)
    protected Date dateCreation;

}
