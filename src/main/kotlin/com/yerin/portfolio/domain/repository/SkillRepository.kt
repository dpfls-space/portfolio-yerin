package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
    
}