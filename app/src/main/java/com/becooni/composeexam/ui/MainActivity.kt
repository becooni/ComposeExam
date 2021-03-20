package com.becooni.composeexam.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.becooni.composeexam.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}