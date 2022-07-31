
package com.primerApp.SprintBoot.repository;

import com.primerApp.SprintBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
        
}
