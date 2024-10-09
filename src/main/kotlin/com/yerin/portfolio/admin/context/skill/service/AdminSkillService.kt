package com.yerin.portfolio.admin.context.skill.service

import com.yerin.portfolio.admin.context.skill.form.SkillForm
import com.yerin.portfolio.admin.data.TableDTO
import com.yerin.portfolio.domain.entity.Skill
import com.yerin.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminSkillService(
    private val skillRepository: SkillRepository
) {
    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

    @Transactional
    fun save(form: SkillForm) {
        val skill = form.toEntity()
        skillRepository.save(skill)
    }

    @Transactional
    fun update(id: Long, form: SkillForm) {
        val skill = form.toEntity()
        skillRepository.save(skill)
    }
}