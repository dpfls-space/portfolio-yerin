package com.yerin.portfolio.domain

import com.yerin.portfolio.domain.constant.SkillType
import com.yerin.portfolio.domain.entity.*
import com.yerin.portfolio.domain.repository.*
import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
@Profile(value = ["default"])
class DataInitializer(
    private val achievementRepository: AchievementRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val skillRepository: SkillRepository,
    private val projectRepository: ProjectRepository,
    private val experienceRepository: ExperienceRepository
) {
    @PostConstruct
    fun initializeDate() {

        println("스프링이 실행되었습니다. 테스트 데이터를 초기화합니다.")

        val achievements = mutableListOf<Achievement>(
            Achievement(
                title = "2022 catkao 해커톤 최우수상",
                description = "고양이 쇼핑몰 검색 서비스의 아키텍처, 데이터 모델링",
                host = "캣카오",
                achievedDate = LocalDate.of(2022, 8, 24),
                isActive = true
            ),
            Achievement(
                title = "정보처리기사",
                description = "자료구조, 운영체제, 알고리즘, 데이터베이스 등",
                host = "한국산업인력공단",
                achievedDate = LocalDate.of(2020, 9, 30),
                isActive = true
            )
        )

        achievementRepository.saveAll(achievements)

        val introductions = mutableListOf<Introduction>(
            Introduction(content = "주도적으로 문제를 찾고, 해결하는 고양이입니다.", isActive = true),
            Introduction(content = "기술을 위한 기술이 아닌, 비즈니스 문제를 풀기 위한 기술을 추구합니다.", isActive = true),
            Introduction(content = "기존 소스를 리팩토링하여 더 좋은 구조로 개선하는 작업을 좋아합니다.", isActive = true)
        )

        introductionRepository.saveAll(introductions)

        val links = mutableListOf<Link>(
            Link(name = "Github", content = "https://github.com/dpfls-space", isActive = true),
            Link(name = "velog", content = "https://velog.io/@38265ye/posts", isActive = true)
        )

        linkRepository.saveAll(links)

        val experience1 = Experience(
            title = "캣홀릭대학교",
            description = "경영학 전공",
            startYear = 2019,
            startMonth = 12,
            endYear = 2022,
            endMonth = 8,
            isActive = true
        )

        experience1.addDetails(
            mutableListOf(
                ExperienceDetail(content = "GPA 3.9/4.5", isActive = true)
            )
        )

        val experience2 =Experience(
            title = "주식회사 캣카오",
            description = "소셜서비스팀 백엔드 개발자",
            startYear = 2022,
            startMonth = 9,
            endYear = null,
            endMonth = null,
            isActive = true
        )

        experience2.addDetails(
            mutableListOf(
                ExperienceDetail(content = "성취도우수상 수상", isActive = true)
            )
        )

        experienceRepository.saveAll(mutableListOf(experience1, experience2))

        val java = Skill(name = "Java", type = SkillType.LANGUAGE.name, isActive = true)
        val spring = Skill(name = "Spring", type = SkillType.LANGUAGE.name, isActive = true)
        val oracle = Skill(name = "oracle", type = SkillType.LANGUAGE.name, isActive = true)
        val springBoot = Skill(name = "SpringBoot", type = SkillType.LANGUAGE.name, isActive = true)
        val javascript = Skill(name = "JavaScript", type = SkillType.LANGUAGE.name, isActive = true)
        val jquery = Skill(name = "Jquery", type = SkillType.LANGUAGE.name, isActive = true)
        val jsp = Skill(name = "JSP", type = SkillType.LANGUAGE.name, isActive = true)
        skillRepository.saveAll(mutableListOf(java, spring, oracle, springBoot, javascript, jquery, jsp))

        val project1 = Project(
            name = "혼밥심",
            description = "혼밥러를 위한 레시피 공유 및 커뮤니티 서비스",
            startYear = 2024,
            startMonth = 6,
            endYear = 2024,
            endMonth = 7,
            isActive = true
        )

        project1.addDetails(
            mutableListOf(
                ProjectDetail(content = "회원가입, 회원정보 수정, 회원탈퇴", url = null, isActive = true),
                ProjectDetail(content = "헤더 메뉴 디자인 및 기능", url = null, isActive = true),
                ProjectDetail(content = "Github Repository", url = "https://github.com/dpfls-space/Honbapsim", isActive = true)
            )
        )

        project1.skills.addAll(
            mutableListOf(
                ProjectSkill(project = project1, skill = java),
                ProjectSkill(project = project1, skill = spring),
                ProjectSkill(project = project1, skill = oracle),
                ProjectSkill(project = project1, skill = javascript)
            )
        )

        val project2 = Project(
            name = "여기",
            description = "여행족들을 위한 여행 일정 작성, 관광지 조회, 플래너의 맞춤 일정, 커뮤니티 서비스",
            startYear = 2024,
            startMonth = 7,
            endYear = 2024,
            endMonth = 9,
            isActive = true
        )

        project1.addDetails(
            mutableListOf(
                ProjectDetail(content = "여행 일정 작성", url = null, isActive = true),
                ProjectDetail(content = "javaScript, aJax 를 활용한 비동기 화면 구현", url = null, isActive = true),
                ProjectDetail(content = "Github Repository", url = "https://github.com/dpfls-space/TripRecord", isActive = true)
            )
        )

        project2.skills.addAll(
            mutableListOf(
                ProjectSkill(project = project2, skill = java),
                ProjectSkill(project = project2, skill = springBoot),
                ProjectSkill(project = project2, skill = oracle),
                ProjectSkill(project = project2, skill = javascript)
            )
        )

        projectRepository.saveAll(mutableListOf(project1, project2))
    }
}