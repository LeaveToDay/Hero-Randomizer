package com.staynight.lab7herorandomizer

import android.app.Application
import com.staynight.lab7herorandomizer.di.AppComponent
import com.staynight.lab7herorandomizer.di.AppModule
import com.staynight.lab7herorandomizer.di.DaggerAppComponent

class HeroApp : Application() {

    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}