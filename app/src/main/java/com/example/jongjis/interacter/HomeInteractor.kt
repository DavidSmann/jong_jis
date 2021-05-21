package com.example.jongjis.interacter

import com.danny.coremodule.CorePresenter
import com.danny.coremodule.CoreView
import com.example.jongjis.view.adapter.HometapAdapter
import org.json.JSONObject

interface HomeInteractor {
    interface View : CoreView {
        fun onHomeResponse(data: JSONObject)
        fun onHomeFailed(message: String)
        fun setUpHomeTap(hometapAdapter : HometapAdapter)
    }

    interface Presenter : CorePresenter<View> {
        fun onHome(code:String)
    }
}