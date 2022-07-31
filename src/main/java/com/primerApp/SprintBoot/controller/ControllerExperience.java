package com.primerApp.SprintBoot.controller;

import com.primerApp.SprintBoot.model.Experience;
import com.primerApp.SprintBoot.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ControllerExperience 
{
    
      @Autowired
      private IExperienceService expericenceService;
      
      
      @GetMapping("/get/experience/{id}")
      public List<Experience> getExperience(@PathVariable Long id)
      {
          return expericenceService.getExperienceByUser(id);
      }
      @GetMapping("/get/experienceForId/{id}")
       public Experience getExperienceForId(@PathVariable Long id)
      {
          return expericenceService.getExperience(id);
      }
      
      @PostMapping("/new/experience")
      public void newExperience(@RequestBody Experience  experience )
      {
          //experience.getUser().setIduser(Long.parseLong("1"));
          expericenceService.newExperience(experience);
      }
      
      @DeleteMapping("/delete/experience/{id}")
      public void deleteExperience(@PathVariable Long id)
      {
          expericenceService.deleteExperience(id);
      }
      
      @PutMapping("/update/experience/{id}")
      public Experience updateExperience(@PathVariable Long id,@RequestBody Experience  experience )
      {
          Experience exp  = expericenceService.getExperienceForId(id);
          
          exp.setNamecompany(experience.getNamecompany());
          exp.setTypejob(experience.getTypejob());
	  exp.setEndyear(exp.getEndyear());
          exp.setStartyear(experience.getStartyear());
          exp.setDescription(experience.getDescription());     ;
      
                

		expericenceService.newExperience(exp);
		return exp;
      }    
}
