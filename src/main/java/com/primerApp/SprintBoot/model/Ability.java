
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
@Table(name ="ability")
public class Ability 
{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idability;
     
     
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user; 
  
     private String nameability;
     private String description;
     private int   percentage;
     
    

    public Ability() {
    }

    public Ability(Long idAbility, String nameAbility, String description, int percentage, User user) {
        this.idability = idAbility;
        this.nameability = nameAbility;
        this.description = description;
        this.percentage = percentage;
        this.user = user;
    }
     
      
     
}
