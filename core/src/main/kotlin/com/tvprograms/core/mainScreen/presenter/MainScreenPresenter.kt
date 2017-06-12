package com.tvprograms.core.mainScreen.presenter

import com.tvprograms.core.mainScreen.view.MainScreenView
import javax.inject.Inject

class MainScreenPresenter @Inject constructor(var view: MainScreenView) {

    fun isAttach(){
        view.doSomething()
    }
}