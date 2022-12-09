package com.staynight.lab7herorandomizer.data.repository

import com.staynight.lab7herorandomizer.data.models.Hero
import com.staynight.lab7herorandomizer.data.network.Api
import com.staynight.lab7herorandomizer.domain.repository.HeroRepository
import io.reactivex.Single
import javax.inject.Inject

class HeroRepositoryImpl @Inject constructor(
    private val api: Api
) : HeroRepository {
    override fun getHero(heroId: Int): Single<Hero> {
        return api.getHero(heroId)
            .onErrorReturn { return@onErrorReturn Hero(name = "error") }
    }
}