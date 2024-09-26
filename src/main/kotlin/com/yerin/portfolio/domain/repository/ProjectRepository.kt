package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achivement
import com.yerin.portfolio.domain.entity.Experience
import com.yerin.portfolio.domain.entity.HttpInterface
import com.yerin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {
    
}