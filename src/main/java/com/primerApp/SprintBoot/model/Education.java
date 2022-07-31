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

/**
 *
 * @author Leandro
 */
@Getter @Setter
@Entity
@Table(name = "educations")
public class Education 
{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long ideducation;
     
     
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
     
     
     private String description;
     private String name;
     private String condition;
     private String title;

    public Education() {
    }

    public Education(Long ideducation, User user, String description, String name, String condition, String title) {
        this.ideducation = ideducation;
        this.user = user;
        this.description = description;
        this.name = name;
        this.condition = condition;
        this.title = title;
    }
     
     
}
