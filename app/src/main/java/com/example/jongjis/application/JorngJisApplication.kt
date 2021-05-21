package com.example.jongjis.application

import android.app.Application
import android.os.StrictMode

class JorngJisApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
    }


    companion object {

//        val permissions = arrayListOf<String>()
//        val features = arrayListOf<String>()
//        var settingConfigs: AppConfigs? = null
        /**
         * isInternetConnected default value is true becuz don't wan't to show snackbar when app open
         * with internet have connected
         */

        var accessToken = ""  //Store temp token

        var isInternetConnected = true

        var activityVisible: Boolean = false

        var isCloseRewardReminder: Boolean = false

        fun onActivityResume() {
            activityVisible = true
        }

        fun onActivityPause() {
            activityVisible = false

        }

    }
}