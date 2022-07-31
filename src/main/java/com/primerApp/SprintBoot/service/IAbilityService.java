package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Ability;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IAbilityService 
{
    public List<Ability> getAbility();
    public  void newAbility(Ability ability);
    public void deleteAbility(Long id);
    public Ability getAbility(Long id);
    public void UpdateAbility(Ability ability);    
}
