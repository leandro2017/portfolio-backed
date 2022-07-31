package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.Ability;
import com.primerApp.SprintBoot.repository.AbilityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class AbilityService implements IAbilityService{

    
    @Autowired
    public AbilityRepository abilityRepository;
    
    @Override
    public List<Ability> getAbility() 
    {
       return abilityRepository.findAll();
    }

    @Override
    public void newAbility(Ability ability) 
    {
        abilityRepository.save(ability);
    }

    @Override
    public void deleteAbility(Long id) {
        abilityRepository.deleteById(id);
    }

    @Override
    public Ability getAbility(Long id) {
        return abilityRepository.findById(id).orElse(null);
    }

    @Override
    public void UpdateAbility(Ability ability) 
    {
        
    }
    
}
