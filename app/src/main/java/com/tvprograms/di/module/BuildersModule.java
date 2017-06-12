package com.tvprograms.di.module;

import android.app.Activity;

import com.tvprograms.di.component.MainScreenComponent;
import com.tvprograms.mainScreen.activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivityInjectorFactory(MainScreenComponent.Builder builder);

}
