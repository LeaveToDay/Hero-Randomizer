package com.staynight.lab7herorandomizer.data.network

import com.staynight.lab7herorandomizer.data.models.Hero
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path


interface Api {
    @GET("id/{heroId}.json")
    fun getHero(@Path("heroId") heroId: Int): Single<Hero>
}

