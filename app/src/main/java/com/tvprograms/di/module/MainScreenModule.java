package com.tvprograms.di.module;

import com.tvprograms.core.mainScreen.view.MainScreenView;
import com.tvprograms.mainScreen.activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainScreenModule {
    @Binds
    abstract MainScreenView provideFeatureView(MainActivity featureActivity);
}
