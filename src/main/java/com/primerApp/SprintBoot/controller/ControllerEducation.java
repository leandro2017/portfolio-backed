
package com.primerApp.SprintBoot.controller;


import com.primerApp.SprintBoot.model.Education;
import com.primerApp.SprintBoot.service.IEducationService;
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
public class ControllerEducation 
{
      
       @Autowired 
      private IEducationService ieducationService;
    
      @GetMapping("/get/education")
      public List<Education> getEducation()
      {
          return ieducationService.getEducation();
      }
       @GetMapping("/get/educationForId/{id}")
       public Education getEducationForId(@PathVariable Long id)
      {
          return ieducationService.getEducation(id);
      }
      @PostMapping("/new/education")
      public void newEducation(@RequestBody Education  education )
      {
          ieducationService.newEducation(education);
      }
      
      @DeleteMapping("/deleteEducation/{id}")
      public void deleteEducation(@PathVariable Long id)
      {
          ieducationService.deleteEducation(id);
      }
      
      @PutMapping("/updateEducation/{id}")
      public Education updateEducation(@PathVariable Long id,@RequestBody Education  education )
      {
           Education edu =  ieducationService.getEducation(id);
           edu.setCondition(education.getCondition());
           edu.setDescription(education.getDescription());
           edu.setName(education.getName());
           edu.setTitle(education.getTitle());
          
          
          ieducationService.newEducation(edu);
          return edu;
      }       
}
