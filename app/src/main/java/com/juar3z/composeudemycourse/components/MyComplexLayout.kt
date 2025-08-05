package com.juar3z.composeudemycourse.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        ) {}
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Row {
                Box(modifier = Modifier
                    .weight(1f)
                    .height(25.dp)
                    .background(Color.Gray)) { }
                Box(modifier = Modifier
                    .weight(1f)
                    .height(75.dp)
                    .background(Color.Green )) { }
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow)
        ) {}
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyComplexLayoutPreview() {
    MyComplexLayout()
}