package com.yerin.portfolio.admin.context.skill.service

import com.yerin.portfolio.admin.data.TableDTO
import com.yerin.portfolio.domain.entity.Skill
import com.yerin.portfolio.domain.repository.SkillRepository

class AdminSkillService(
    private val skillRepository: SkillRepository
) {
    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}