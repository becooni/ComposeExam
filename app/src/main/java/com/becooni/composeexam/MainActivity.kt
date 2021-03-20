package com.becooni.composeexam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BasicText("Hello World !!")
        }
        setContent {
            Greeting("cjh")
        }
    }

    @Composable
    fun Greeting(name: String) {
        BasicText(text = name)
    }
}