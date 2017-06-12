package com.tvprograms.di.component;

import com.tvprograms.core.mainScreen.view.MainScreenView;
import com.tvprograms.di.module.MainScreenModule;
import com.tvprograms.mainScreen.activity.MainActivity;

import dagger.Binds;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {MainScreenModule.class})
public interface MainScreenComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
