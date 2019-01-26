package com.google.samples.apps.iosched.di

import android.content.Context
import com.google.samples.apps.iosched.MainApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApplication): Context {
        return  application.applicationContext
    }
}