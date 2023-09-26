package me.tabraiz.mvvm.di.component

import android.content.Context
import dagger.Component
import me.tabraiz.mvvm.MVVMApplication
import me.tabraiz.mvvm.data.api.NetworkService
import me.tabraiz.mvvm.data.repository.TopHeadlineRepository
import me.tabraiz.mvvm.di.ApplicationContext
import me.tabraiz.mvvm.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}