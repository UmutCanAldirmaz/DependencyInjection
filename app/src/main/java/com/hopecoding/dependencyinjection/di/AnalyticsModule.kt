package com.hopecoding.dependencyinjection.di

import com.hopecoding.dependencyinjection.analytics.AnalyticsService
import com.hopecoding.dependencyinjection.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {
    @Binds
    abstract fun bindAnalyticsService(AnalyticsServiceImpl: AnalyticsServiceImpl): AnalyticsService
}