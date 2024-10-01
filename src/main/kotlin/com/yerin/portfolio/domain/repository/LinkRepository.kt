package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achievement
import com.yerin.portfolio.domain.entity.Experience
import com.yerin.portfolio.domain.entity.HttpInterface
import com.yerin.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {
    
}