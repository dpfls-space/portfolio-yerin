package com.yerin.portfolio.admin.context.introduction.service

import com.yerin.portfolio.admin.data.TableDTO
import com.yerin.portfolio.domain.entity.Introduction
import com.yerin.portfolio.domain.repository.IntroductionRepository

class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {
    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}