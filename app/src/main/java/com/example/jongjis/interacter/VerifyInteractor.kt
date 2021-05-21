package com.example.jongjis.interacter

import com.danny.coremodule.CorePresenter
import com.danny.coremodule.CoreView
import org.json.JSONObject

interface VerifyInteractor {
    interface View : CoreView {
        fun onVerifyResponse(data: JSONObject)
        fun onVerifyFailed(message: String)
    }

    interface Presenter : CorePresenter<View> {
        fun onVerify(code:String)
    }

}