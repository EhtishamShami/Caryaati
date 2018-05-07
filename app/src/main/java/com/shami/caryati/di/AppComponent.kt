package com.shami.caryati.di

import com.shami.caryati.CaryatiApplication
import com.shami.caryati.ui.activities.mainactivity.MainActivityComponent
import com.shami.caryati.ui.activities.mainactivity.MainActivityModule
import com.shami.caryati.ui.activities.mainactivity.MainActivityRepository
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Shami on 5/6/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class,ApiModule::class))
public interface AppComponent{

    fun inject(caryatiApplication: CaryatiApplication)
    fun inject(mainActivityRepository: MainActivityRepository)
    fun plus(mainActivityModule: MainActivityModule): MainActivityComponent


}