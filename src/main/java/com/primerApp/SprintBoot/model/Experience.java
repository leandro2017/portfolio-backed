/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primerApp.SprintBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Columns;

/**
 *
 * @author Leandro
 */
@Getter @Setter
@Entity
@Table(name = "experiences")
public class Experience 
{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idxperience;
     
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
    
    
    private String typejob;
    private String namecompany;
    private String startyear;
    private String endyear;
    private String description;

    public Experience() {
    }

    public Experience(Long idxperience, User user, String typejob, String namecompany, String startyear, String endyear, String description) {
        this.idxperience = idxperience;
        this.user = user;
        this.typejob = typejob;
        this.namecompany = namecompany;
        this.startyear = startyear;
        this.endyear = endyear;
        this.description = description;
    }
    
    
    
     
     
}
