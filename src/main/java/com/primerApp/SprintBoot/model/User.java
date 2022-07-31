package com.primerApp.SprintBoot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Leandro
 */
@Getter @Setter
@Entity
@Table(name = "users")
public class User 
{    
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long iduser;
     
     private  String name;
     private  String surname;
     private  int age;
     private  String phone;
     private  String residence;
     private  String mail;
     private  String description;
     private  String title;
    
     
     private  String urlphoto;
     
//     @OneToMany(mappedBy = "user")
//     private List<Ability> ability;
//     
//     @OneToMany(mappedBy = "user")
//     private List<Education> educatios;
   
     
    public User() {
    }

    public User(Long idUser, String name, String surName, int age, String phone, String residence, String mail, String description, String title, String urlPhoto) {
        this.iduser = idUser;
        this.name = name;
        this.surname = surName;
        this.age = age;
        this.phone = phone;
        this.residence = residence;
        this.mail = mail;
        this.description = description;
        this.title = title;
        this.urlphoto = urlPhoto;
       
    }
     
     
     
     
}
