package com.example.unittest_android_jetpackcomponent_mvvm

import androidx.compose.material3.Text
import androidx.compose.ui.test.assertHeightIsAtLeast
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertWidthIsAtLeast
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.unit.dp
import org.junit.Rule
import org.junit.Test

class TextViewUnitTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun textViewContent() {
        val text = "Hello, Compose!"
        composeTestRule.setContent {
            Text(text = text)
        }
        composeTestRule.onNodeWithText(text).assertIsDisplayed()
    }

    @Test
    fun textViewSize() {
        val text = "Hello, Compose!"
        composeTestRule.setContent {
            Text(text = text)
        }
        composeTestRule.onNodeWithText(text).assertHeightIsAtLeast(20.dp)
        composeTestRule.onNodeWithText(text).assertWidthIsAtLeast(50.dp)
    }

}