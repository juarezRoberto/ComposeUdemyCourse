package com.juar3z.composeudemycourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.juar3z.composeudemycourse.components.MyBasicConstraintLayout
import com.juar3z.composeudemycourse.components.MyComplexLayout
import com.juar3z.composeudemycourse.ui.theme.ComposeUdemyCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUdemyCourseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyBasicConstraintLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
     }
}