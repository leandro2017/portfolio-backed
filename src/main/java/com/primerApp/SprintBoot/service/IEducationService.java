package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Education;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IEducationService 
{
    public List<Education> getEducation();
    public  void newEducation(Education education);
    public void deleteEducation(Long id);
    public Education getEducation(Long id);
    public void UpdateEducation(Education education);      
}
