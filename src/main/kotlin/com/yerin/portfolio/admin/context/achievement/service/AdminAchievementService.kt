package com.yerin.portfolio.admin.context.achievement.service

import com.yerin.portfolio.admin.data.TableDTO
import com.yerin.portfolio.domain.entity.Achievement
import com.yerin.portfolio.domain.repository.AchievementRepository

class AdminAchievementService(
    private val achievementRespository: AchievementRepository
) {

    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRespository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}