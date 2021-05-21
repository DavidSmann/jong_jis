package com.example.jongjis.presenter

import com.danny.coremodule.CoreImpl
import com.example.jongjis.interacter.VerifyInteractor

class VerifyPresenter :CoreImpl<VerifyInteractor.View>(),
        VerifyInteractor.Presenter{
    override fun onVerify(code: String) {
        TODO("Not yet implemented")
    }
}