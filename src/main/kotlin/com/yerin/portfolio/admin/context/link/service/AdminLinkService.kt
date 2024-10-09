package com.yerin.portfolio.admin.context.link.service

import com.yerin.portfolio.admin.data.TableDTO
import com.yerin.portfolio.domain.entity.Link
import com.yerin.portfolio.domain.repository.LinkRepository

class AdminLinkService(
    private val linkRepository: LinkRepository
) {
    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}