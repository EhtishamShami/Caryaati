package com.shami.caryati.ui.activities.mainactivity

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.shami.caryati.CaryatiApplication
import com.shami.caryati.R
import com.shami.caryati.databinding.ActivityMainBinding
import com.shami.caryati.ui.activities.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    /*
     Variable Declaration
     */

    @Inject
    lateinit var mainActivityFactory: MainActivityFactory

    lateinit var mMainActivityViewModel: MainActivityViewModel


    /*
     Initialization Point of Application
     */

    override fun init(savedInstanceState: Bundle?) {
        (application as CaryatiApplication).createMainActivityComponent().inject(this)

        mMainActivityViewModel = ViewModelProviders.of(this, mainActivityFactory)[MainActivityViewModel::class.java]

    }

    /*
     Setting Layout for activity
     */

    override fun setLayout(): Int {
        return R.layout.activity_main
    }



    /*
   Life Cycler Events
   */


    public override fun onResume() {
        super.onResume()

    }


    override fun onDestroy() {
        (application as CaryatiApplication).releaseMainActivityComponent()
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }




}
