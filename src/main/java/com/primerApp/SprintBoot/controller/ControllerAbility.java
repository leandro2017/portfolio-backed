
package com.primerApp.SprintBoot.controller;

import com.primerApp.SprintBoot.model.Ability;
import com.primerApp.SprintBoot.service.IAbilityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro
 */
@RestController
@CrossOrigin (origins = "*")
public class ControllerAbility 
{
     @Autowired
     private IAbilityService abilityService;

    @GetMapping("/get/ability")
      public List<Ability> getAbility()
      {
          return abilityService.getAbility();
      }
      
      @GetMapping("/get/abilityForId/{id}")
       public Ability getExperienceForId(@PathVariable Long id)
      {
          return abilityService.getAbility(id);
      }
      
      @PostMapping("/new/ability")
      public void newAbility(@RequestBody Ability ability)
      {
          abilityService.newAbility(ability);
      }
      
      @DeleteMapping("/deleteAbility/{id}")
      public void deleteAbility(@PathVariable Long id)
      {
          abilityService.deleteAbility(id);
      }
      
      @PutMapping("/updateAbility/{id}")
      public Ability updateAbility(@PathVariable Long id,@RequestBody Ability ability)
      {
          Ability abi=abilityService.getAbility(id);
          abi.setDescription(ability.getDescription());
          abi.setNameability(ability.getNameability());
          abi.setPercentage(ability.getPercentage());
         abilityService.newAbility(abi);
         return abi;
      }
}
