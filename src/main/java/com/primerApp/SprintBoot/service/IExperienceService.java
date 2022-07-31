package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Experience;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IExperienceService 
{
    public List<Experience> getExperience();
    public Experience getExperienceForId(long id);
    public List<Experience> getExperienceByUser(Long Id);
    public  void newExperience(Experience experience);
    public void deleteExperience(Long id);
    public Experience getExperience(Long id);
    public void UpdateExperience(Experience Experience);    
}
