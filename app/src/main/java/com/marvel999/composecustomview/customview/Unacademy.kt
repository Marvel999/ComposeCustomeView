package com.marvel999.composecustomview.customview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marvel999.composecustomview.ui.theme.ComposeCustomViewTheme

@Composable
fun Unacademy() {
    val topColor = Color(android.graphics.Color.parseColor("#2D81F7"))
    val bottomColor = Color(android.graphics.Color.parseColor("#07BD80"))
    Canvas(
        modifier = Modifier
            .size(size = 100.dp)
    ) {
        drawArc(
            color = topColor,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = false,
            size = size/1.5f,
            topLeft = Offset(x = size.width / 5.5f, y = 0f)
        )
        drawArc(

            color = bottomColor,
            startAngle = 0f,
            sweepAngle = -180f,
            useCenter = false,
            size = size/3f,
            topLeft = Offset(size.width / 2.92f, size.height * .665f)
        )
    }
}

@Preview
@Composable
fun UnacademyPreview() {
    ComposeCustomViewTheme {
        Unacademy()
    }
}