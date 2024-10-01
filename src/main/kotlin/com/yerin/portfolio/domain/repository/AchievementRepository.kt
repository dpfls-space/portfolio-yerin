package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement where is Active = :isActive
    fun findAllByIsActive(isActive: Boolean) :List<Achievement>
}