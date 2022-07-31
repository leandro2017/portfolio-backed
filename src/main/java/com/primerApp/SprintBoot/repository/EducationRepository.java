package com.primerApp.SprintBoot.repository;

import com.primerApp.SprintBoot.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro
 */
@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
     @Query("select e from Education e where e.user.iduser = :idUser")
     List<Education> findByUserId(@Param("idUser") Long idUser);
}
