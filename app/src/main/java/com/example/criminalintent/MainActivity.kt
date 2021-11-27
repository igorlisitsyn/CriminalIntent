package com.example.criminalintent

import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        val fragment: Fragment
        if (currentFragment == null) {
            fragment = CrimeListFragment.newInstance()

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }
}