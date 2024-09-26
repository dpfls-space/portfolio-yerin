package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.entity.Achivement
import org.springframework.data.jpa.repository.JpaRepository

interface AchivementRepository : JpaRepository<Achivement, Long> {

}