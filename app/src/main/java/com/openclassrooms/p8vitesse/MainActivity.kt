package com.openclassrooms.p8vitesse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.openclassrooms.p8vitesse.ui.homescreen.HomeFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragment_container,
                    HomeFragment()
                )
                .commit()
        }
    }


}
