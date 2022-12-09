package com.staynight.lab7herorandomizer.domain.repository

import com.staynight.lab7herorandomizer.data.models.Hero
import io.reactivex.Single

interface HeroRepository {
    fun getHero(heroId: Int): Single<Hero>
}