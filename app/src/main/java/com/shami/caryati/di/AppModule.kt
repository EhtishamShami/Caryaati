package com.shami.caryati.di

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import com.shami.caryati.data.CaryatiApiService
import com.shami.caryati.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Shami on 5/6/2018.
 */

@Module
class AppModule(var application: Application){


    /*
     Method to return context of application
     */

    @Provides
    @Singleton
    fun provideContext(): Context
    {
        return application
    }


    /*
     Method to call for server apis
     */

    @Provides
    @Singleton
    fun getServerApi(retrofit: Retrofit): CaryatiApiService
    {
        return retrofit.create(CaryatiApiService::class.java)
    }


    /*
    Method to Check Network states
     */

    @Provides
    @Singleton
    @Named(Constants.isNetwork)
    fun isOnline(context: Context): Boolean {

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo.isConnectedOrConnecting
    }



}