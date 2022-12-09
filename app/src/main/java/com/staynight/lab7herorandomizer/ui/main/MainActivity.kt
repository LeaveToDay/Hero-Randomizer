package com.staynight.lab7herorandomizer.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import coil.load
import coil.transform.RoundedCornersTransformation
import com.staynight.lab7herorandomizer.HeroApp
import com.staynight.moviedb.databinding.ActivityMainBinding
import com.staynight.lab7herorandomizer.utils.binding.BindingActivity
import javax.inject.Inject
import kotlin.random.Random

class MainActivity : BindingActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<MainViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        (application as HeroApp).appComponent?.injectMain(this)
        setupObservers()
        viewModel.getHero(1)
        setupListeners()
    }

    private fun setupObservers() {
        viewModel.liveData.observe(this) { hero ->
            binding.ivHero.load(hero.images?.lg) {
                crossfade(true)
                transformations(RoundedCornersTransformation(16.toFloat()))
                error(com.google.android.material.R.drawable.mtrl_ic_error)
            }
            binding.tvHeroName.text = hero.name
        }
    }

    private fun setupListeners() {
        binding.btnRoll.setOnClickListener{
            viewModel.getHero(Random.nextInt(1, 100))
        }
    }
}