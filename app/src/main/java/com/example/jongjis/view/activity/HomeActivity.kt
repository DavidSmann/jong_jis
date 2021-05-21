package com.example.jongjis.view.activity

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import androidx.core.app.ActivityCompat
import com.example.jongjis.R
import com.example.jongjis.interacter.HomeInteractor
import com.example.jongjis.presenter.HomePresenter
import com.example.jongjis.view.adapter.HometapAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import kotlinx.android.synthetic.main.activity_home.*
import org.json.JSONObject

class HomeActivity : BaseActivity<HomeInteractor.View,HomeInteractor.Presenter>(),
        HomeInteractor.View {
    override var mPresenter: HomeInteractor.Presenter = HomePresenter()

    override fun getLayout(): Int  = R.layout.activity_home

    override fun onHomeResponse(data: JSONObject) {
        TODO("Not yet implemented")
    }

    override fun onHomeFailed(message: String) {
        TODO("Not yet implemented")
    }

    override fun setUpHomeTap(hometapAdapter : HometapAdapter) {
        vwHomeTap.adapter = hometapAdapter
        val tabLayoutMediator = TabLayoutMediator(
                tabHome, vwHomeTap, TabConfigurationStrategy { tab, position ->
            when (position) {
                0 -> tab.text = "Home"
                1 -> tab.text = "Shop"
            }
        })
        tabLayoutMediator.attach()
    }

    override fun initView(){
        setStatusBarColor(ActivityCompat.getColor(this, android.R.color.white))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        setUpHomeTap(HometapAdapter(this))

    }

    companion object {

        fun launch(context: Context) {
            val intent = Intent(context, HomeActivity::class.java)
            context.startActivity(intent)
        }

    }
}