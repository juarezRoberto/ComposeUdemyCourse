package com.juar3z.composeudemycourse.componentslearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGray, boxYellow, boxMagenta, boxGreen, blackBox) = createRefs()
        val (bigBoxMagenta, bigBoxCyan, bigBoxDarkGray) = createRefs()
        val littleBoxSize = 75.dp
        val bigBoxSize = 150.dp

        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Black)
                .constrainAs(blackBox) {
                    start.linkTo(bigBoxCyan.end)
                    bottom.linkTo(bigBoxCyan.bottom)
                    top.linkTo(bigBoxCyan.top)
                })

        Box(
            modifier = Modifier
                .size(bigBoxSize)
                .background(Color.Cyan)
                .constrainAs(bigBoxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                })
        Box(
            modifier = Modifier
                .size(bigBoxSize)
                .background(Color.DarkGray)
                .constrainAs(bigBoxDarkGray) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxGreen.start)
                })
        Box(
            modifier = Modifier
                .size(bigBoxSize)
                .background(Color.Blue)
                .constrainAs(bigBoxMagenta) {
                    end.linkTo(parent.end)
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(parent.start)
                })

        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                })
        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    top.linkTo(boxYellow.bottom)
                    end.linkTo(boxYellow.start)
                })
        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxYellow.end)
                })
        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxYellow.top)
                    end.linkTo(boxYellow.start)
                })
        Box(
            modifier = Modifier
                .size(littleBoxSize)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyBasicConstraintLayoutPreview(modifier: Modifier = Modifier) {
    MyBasicConstraintLayout()
}