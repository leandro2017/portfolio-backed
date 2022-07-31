package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Education;
import com.primerApp.SprintBoot.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class EducationService implements IEducationService
{
    @Autowired
    public EducationRepository educationRepository;

    @Override
    public List<Education> getEducation() {
       return educationRepository.findAll();
    }

    @Override
    public void newEducation(Education education) {
         educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public Education getEducation(Long id) {
      return educationRepository.findById(id).orElse(null);
    }

    @Override
    public void UpdateEducation(Education education) {
       
    }
            
    
}
