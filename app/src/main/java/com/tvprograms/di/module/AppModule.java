package com.tvprograms.di.module;

import android.content.Context;

import com.tvprograms.TvProgramApplication;
import com.tvprograms.di.component.MainScreenComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {MainScreenComponent.class})
public class AppModule {

    @Provides
    Context provideContext(TvProgramApplication application) {
        return application.getApplicationContext();
    }
}
