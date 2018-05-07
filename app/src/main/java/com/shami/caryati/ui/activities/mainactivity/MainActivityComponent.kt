package com.shami.caryati.ui.activities.mainactivity

import dagger.Subcomponent

/**
 * Created by Shami on 5/6/2018.
 */

@MainActivityScope
@Subcomponent(modules = arrayOf(MainActivityModule::class))
public interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

}