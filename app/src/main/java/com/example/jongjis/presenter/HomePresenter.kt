package com.example.jongjis.presenter

import com.danny.coremodule.CoreImpl
import com.example.jongjis.interacter.HomeInteractor

class HomePresenter: CoreImpl<HomeInteractor.View>(),
        HomeInteractor.Presenter {
    override fun onHome(code: String) {
        TODO("Not yet implemented")
    }
}