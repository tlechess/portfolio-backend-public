package com.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.models.Education;

//Repository for Education
public interface EducationRepository extends JpaRepository<Education, Integer>  {

}
