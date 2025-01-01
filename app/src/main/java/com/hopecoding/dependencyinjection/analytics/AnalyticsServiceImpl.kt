package com.hopecoding.dependencyinjection.analytics

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor():AnalyticsService {
    override fun analyticsMethos() {
        Log.i("AnalyticsServiceImpl","AnalyticsServiceImpl run")
    }
}