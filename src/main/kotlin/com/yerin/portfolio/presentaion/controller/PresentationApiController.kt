package com.yerin.portfolio.presentaion.controller

import com.yerin.portfolio.presentaion.dto.IntroductionDTO
import com.yerin.portfolio.presentaion.dto.LinkDTO
import com.yerin.portfolio.presentaion.dto.ProjectDTO
import com.yerin.portfolio.presentaion.dto.ResumeDTO
import com.yerin.portfolio.presentaion.service.PresentationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PresentationApiController(
    private val presentationService: PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "OK"
    }

    @GetMapping("/v1/introductions")
    fun getIntroductions():List<IntroductionDTO> {
        return presentationService.getIntroductions()
    }


    @GetMapping("/v1/links")
    fun getLinks():List<LinkDTO> {
        return presentationService.getLinks()
    }

    @GetMapping("/v1/resume")
    fun getResume():ResumeDTO {
        return presentationService.getResume()
    }

    @GetMapping("/v1/projects")
    fun getProjects():List<ProjectDTO> {
        return presentationService.getProjects()
    }

}