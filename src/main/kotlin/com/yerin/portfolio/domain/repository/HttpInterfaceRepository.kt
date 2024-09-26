package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achivement
import com.yerin.portfolio.domain.entity.Experience
import com.yerin.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {
    
}