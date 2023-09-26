package me.tabraiz.mvvm.di.component

import dagger.Component
import me.tabraiz.mvvm.di.ActivityScope
import me.tabraiz.mvvm.di.module.ActivityModule
import me.tabraiz.mvvm.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}