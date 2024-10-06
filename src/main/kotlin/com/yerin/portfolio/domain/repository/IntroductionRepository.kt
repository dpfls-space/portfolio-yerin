package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    // select * from Introduction where is Active = :isActive
    fun findAllByIsActive(isActive: Boolean) :List<Introduction>
}