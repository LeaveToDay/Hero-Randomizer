package com.staynight.lab7herorandomizer.domain.usecase

import com.staynight.lab7herorandomizer.domain.repository.HeroRepository
import javax.inject.Inject

class GetHeroUseCase @Inject constructor(private val heroRepository: HeroRepository) {
    fun getHero(heroId: Int) = heroRepository.getHero(heroId)
}