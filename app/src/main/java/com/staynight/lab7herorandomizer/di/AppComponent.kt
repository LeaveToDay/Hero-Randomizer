package com.staynight.lab7herorandomizer.di

import com.staynight.lab7herorandomizer.ui.main.MainActivity
import com.staynight.lab7herorandomizer.utils.helpers.ViewModelBuilder
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        ViewModelModule::class,
        ViewModelBuilder::class,
        StorageModule::class]
)
interface AppComponent {
    fun injectMain(mainActivity: MainActivity)
}