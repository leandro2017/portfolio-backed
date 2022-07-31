
package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Experience;
import com.primerApp.SprintBoot.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class ExperienceService implements IExperienceService
{
   @Autowired
    public ExperienceRepository experienceRepository;    

     @Override
    public List<Experience> getExperience() 
    {
       return experienceRepository.findAll();
    }

    @Override
    public void newExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience getExperience(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Override
    public void UpdateExperience(Experience Experience) 
    {
        
    }

    @Override
    public List<Experience> getExperienceByUser(Long Id) 
    {
        return experienceRepository.findByUserId(Id);
    }

    @Override
    public Experience getExperienceForId(long id) {
        return experienceRepository.findById(id).orElse(null);
    }

   

   

}
