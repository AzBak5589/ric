package com.sgric.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String genre;
    @Column
    private String profession;
    @Column
    private String entreprise;
    @Column
    private String telephone;
    @Column
    private String login;
    @Column
    private String password="1234";
    @Column
    private String message;
    @Column
    private String email;

}
