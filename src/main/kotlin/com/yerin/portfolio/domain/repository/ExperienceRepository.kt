package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achivement
import com.yerin.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {
    
}