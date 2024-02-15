package com.example.moengageassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moengage.core.DataCenter
import com.moengage.core.MoEngage

class MainActivity : AppCompatActivity() {
    override fun onCreate() {
        super.onCreate()

    	val moEngage = MoEngage.Builder(this, "SO4PCE7SVGA3BL9ATUWEOO5F", [DataCenter.DATA_CENTER_1])
                     .build()
        MoEngage.initialiseDefaultInstance(moEngage)

        setContentView(R.layout.activity_main)
    }
}
