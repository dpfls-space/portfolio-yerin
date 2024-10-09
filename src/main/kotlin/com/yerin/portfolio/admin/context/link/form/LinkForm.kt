package com.yerin.portfolio.admin.context.link.form

import com.yerin.portfolio.domain.entity.Link
import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

data class LinkForm (
    @field:NotBlank(message = "필수값입니다.")
    val name: String,

    @field:NotBlank(message = "필수값입니다.")
    val content: String,
    val isActive: Boolean
) {

    fun toEntity(): Link {
        return Link(
            name = this.name,
            content = this.content,
            isActive = this.isActive
        )
    }

    fun toEntity(id:Long): Link {
        val link = this.toEntity()
        link.id = id

        return link
    }
}