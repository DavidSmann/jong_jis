package com.example.jongjis.view.activity

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import androidx.core.app.ActivityCompat
import com.example.jongjis.R
import com.example.jongjis.interacter.VerifyInteractor
import com.example.jongjis.presenter.VerifyPresenter
import kotlinx.android.synthetic.main.activity_verify.*
import org.json.JSONObject

class VerifyActivity : BaseActivity<VerifyInteractor.View, VerifyInteractor.Presenter>(),
        VerifyInteractor.View{
    override var mPresenter: VerifyInteractor.Presenter = VerifyPresenter()

    override fun getLayout(): Int = R.layout.activity_verify

    override fun onVerifyResponse(data: JSONObject) {
        TODO("Not yet implemented")
    }

    override fun onVerifyFailed(message: String) {
        TODO("Not yet implemented")
    }

    override fun initView() {
        setStatusBarColor(ActivityCompat.getColor(this, android.R.color.white))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        btn_verify.setOnClickListener { HomeActivity.Companion.launch(this) }
    }

    companion object {

        fun launch(context: Context) {
            val intent = Intent(context, VerifyActivity::class.java)
            context.startActivity(intent)
        }

    }

}