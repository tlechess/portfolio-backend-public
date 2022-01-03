package com.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.models.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
