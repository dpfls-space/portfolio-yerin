package com.yerin.portfolio.domain.repository

import com.yerin.portfolio.domain.constant.SkillType
import com.yerin.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface SkillRepository : JpaRepository<Skill, Long> {

    fun findAllByIsActive(isActive: Boolean) :List<Skill>

    // select * from skill where lower(name) = lower(:name) and skill_type = :type
    // jpa 에서 dbms 에서 알아서 대소문자를 가려주는 IgnoreCase
    fun findByNameIgnoreCaseAndType(name: String, type: SkillType): Optional<Skill>
}