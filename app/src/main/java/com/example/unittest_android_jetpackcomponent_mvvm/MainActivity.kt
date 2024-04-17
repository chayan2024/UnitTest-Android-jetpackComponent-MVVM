package com.example.unittest_android_jetpackcomponent_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unittest_android_jetpackcomponent_mvvm.ui.theme.UnitTestAndroidjetpackComponentMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitTestAndroidjetpackComponentMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextViewSample("Hello, Jetpack compose")
                }
            }
        }
    }
}

@Composable
fun TextViewSample(text: String) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = text,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnitTestAndroidjetpackComponentMVVMTheme {
        TextViewSample("Hello, Jetpack compose")
    }
}