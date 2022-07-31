package com.primerApp.SprintBoot.repository;

import com.primerApp.SprintBoot.model.Experience;
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
public interface ExperienceRepository extends JpaRepository<Experience, Long>
{
     @Query("select e from Experience e where e.user.iduser = :idUser")
     List<Experience> findByUserId(@Param("idUser") Long idUser);
 }
