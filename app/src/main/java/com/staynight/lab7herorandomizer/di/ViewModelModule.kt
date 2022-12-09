package com.staynight.lab7herorandomizer.di

import androidx.lifecycle.ViewModel
import com.staynight.lab7herorandomizer.ui.main.MainViewModel
import com.staynight.lab7herorandomizer.utils.helpers.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewMode: MainViewModel): ViewModel
}