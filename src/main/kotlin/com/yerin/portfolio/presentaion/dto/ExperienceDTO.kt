package com.yerin.portfolio.presentaion.dto

import org.springframework.context.annotation.Description

data class ExperienceDTO (
    val title: String,
    val description: String,
    val startYearMonth: String,
    val endYearMonth: String?,
    val details: List<String>
)