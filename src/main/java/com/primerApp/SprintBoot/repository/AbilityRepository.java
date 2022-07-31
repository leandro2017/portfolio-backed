
package com.primerApp.SprintBoot.repository;

import com.primerApp.SprintBoot.model.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro
 */
@Repository
public interface AbilityRepository extends JpaRepository<Ability, Long>{
    
}
