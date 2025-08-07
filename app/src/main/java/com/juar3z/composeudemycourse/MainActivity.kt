package com.juar3z.composeudemycourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.juar3z.composeudemycourse.ui.core.navigation.NavigationWrapper
import com.juar3z.composeudemycourse.ui.theme.ComposeUdemyCourseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUdemyCourseTheme {
                NavigationWrapper()
            }
        }
    }
}