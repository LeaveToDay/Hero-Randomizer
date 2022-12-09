package com.staynight.lab7herorandomizer.di

import com.staynight.lab7herorandomizer.data.network.Api
import com.staynight.lab7herorandomizer.data.repository.HeroRepositoryImpl
import com.staynight.lab7herorandomizer.domain.repository.HeroRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideHeroRepository(api: Api): HeroRepository {
        return HeroRepositoryImpl(api)
    }
}