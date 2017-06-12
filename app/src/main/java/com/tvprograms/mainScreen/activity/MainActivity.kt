package com.tvprograms.mainScreen.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tvprograms.R
import com.tvprograms.core.mainScreen.presenter.MainScreenPresenter
import com.tvprograms.core.mainScreen.view.MainScreenView
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreenView {
    @Inject
    lateinit var presenter: MainScreenPresenter

    override fun doSomething() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        presenter.isAttach()
    }
}