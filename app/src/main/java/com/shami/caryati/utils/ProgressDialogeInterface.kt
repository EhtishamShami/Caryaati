package com.shami.caryati.utils

/**
 * Created by Shami on 5/6/2018.
 */
internal interface ProgressDialogeInterface {

    fun showLoading()

    fun hideLoading()

    fun loadError(e: Throwable)

    fun loadError(msg: String)

}