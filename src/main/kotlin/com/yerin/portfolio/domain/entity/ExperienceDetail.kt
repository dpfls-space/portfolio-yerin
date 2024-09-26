package com.yerin.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ExperienceDetail: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null
    

}