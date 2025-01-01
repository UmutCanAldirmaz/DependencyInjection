package com.hopecoding.dependencyinjection

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hopecoding.dependencyinjection.analytics.AnalyticsAdapter
import com.hopecoding.dependencyinjection.analytics.AnalyticsService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        defaultActivityCodes()

//        analyticsAdapter = AnalyticsAdapter(object: AnalyticsService{
//            override fun analyticsMethos() {
//                Log.i("AnalyticsAdapter","AnalyticsAdapter run")
//            }
//
//        })

        analyticsAdapter.service.analyticsMethos()

    }

    private fun defaultActivityCodes(){
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}