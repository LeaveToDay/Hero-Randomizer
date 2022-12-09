package com.staynight.lab7herorandomizer.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.staynight.lab7herorandomizer.data.models.Hero
import com.staynight.lab7herorandomizer.domain.usecase.GetHeroUseCase
import com.staynight.lab7herorandomizer.utils.helpers.DisposeBagViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel @Inject constructor(private val getHeroUseCase: GetHeroUseCase) :
    DisposeBagViewModel() {
    private val state = MutableLiveData<Hero>()
    val liveData: LiveData<Hero> = state

    fun getHero(heroId: Int) {
        disposeBag.add(getHeroUseCase.getHero(heroId)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(
                { hero ->
                    state.value = hero
                }, {
                    Log.e("TAG", "getHero: $it", )
                }
            )
        )
    }
}