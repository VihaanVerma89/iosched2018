package com.google.samples.apps.iosched.di

import com.google.samples.apps.iosched.ui.LaunchModule
import com.google.samples.apps.iosched.ui.LauncherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule{

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LaunchModule::class])
    internal abstract fun launcherActivity(): LauncherActivity
}