package com.shami.caryati

import android.app.Application
import com.shami.caryati.di.ApiModule
import com.shami.caryati.di.AppComponent
import com.shami.caryati.di.AppModule
import com.shami.caryati.di.DaggerAppComponent
import com.shami.caryati.ui.activities.mainactivity.MainActivityComponent
import com.shami.caryati.ui.activities.mainactivity.MainActivityModule

/**
 * Created by Shami on 5/6/2018.
 */
open class CaryatiApplication: Application() {

    /*
     Dagger App component with scoop of whole application
     */

    val appComponent:AppComponent by lazy {
        createComponent()
    }

    var mainActivityComponent:MainActivityComponent?=null



    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)

        mainActivityComponent=createMainActivityComponent()

    }

    /*
     Method to return the Dagger App component
     */

    fun createComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .apiModule(ApiModule(this))
                .build()

    }



    fun createMainActivityComponent(): MainActivityComponent {
        return appComponent.plus(MainActivityModule())
    }

    fun releaseMainActivityComponent() {
        mainActivityComponent=null
    }

}