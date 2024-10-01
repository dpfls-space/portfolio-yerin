package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achievement
import com.yerin.portfolio.domain.entity.Experience
import com.yerin.portfolio.domain.entity.HttpInterface
import com.yerin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectRepository : JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean) :List<Project>

}