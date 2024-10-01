package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achievement
import com.yerin.portfolio.domain.entity.Experience
import com.yerin.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive: Boolean) :List<Experience>
}