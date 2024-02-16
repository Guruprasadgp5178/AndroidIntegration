package com.example.moengageassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moengage.core.DataCenter
import com.moengage.core.MoEngage

class MyApplication : Application() { // extends here
override fun onCreate() { 
super.onCreate()

val moEngage = MoEngage.Builder(this, "YOUR_APP_ID", [YOUR_DATA_CENTER])
               .build() // need to provide app id and data center
                        // (from DataCenterclass object)
 
MoEngage.initialiseDefaultInstance(moEngage)
  }
}
