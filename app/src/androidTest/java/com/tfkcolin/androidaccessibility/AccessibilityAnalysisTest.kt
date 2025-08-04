package com.tfkcolin.androidaccessibility

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.junit4.accessibility.enableAccessibilityChecks
import androidx.compose.ui.test.tryPerformAccessibilityChecks
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AccessibilityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setup() {
        // Enable accessibility checks before running tests
        composeTestRule.enableAccessibilityChecks()
    }

    @Test
    fun testComponentAccessibility() {
        // Set the composable content to test
        composeTestRule.setContent {

        }

        // Perform accessibility checks on the whole content
        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }
}