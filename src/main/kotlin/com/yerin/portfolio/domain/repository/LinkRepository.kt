package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {

    // select * from Link where is Active = :isActive
    fun findAllByIsActive(isActive: Boolean) :List<Link>
}