package com.tvprograms.di.component;

import com.tvprograms.TvProgramApplication;
import com.tvprograms.di.module.AppModule;
import com.tvprograms.di.module.BuildersModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class, BuildersModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(TvProgramApplication application);

        AppComponent build();
    }

    void inject(TvProgramApplication application);
}
