package com.marvel999.composecustomview.customview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marvel999.composecustomview.ui.theme.ComposeCustomViewTheme

@Composable
fun Youtube(){
    Canvas(
        modifier = Modifier
        .size(width = 100.dp, height = 80.dp)
    ){
        val trianglePath = Path().let {
            it.moveTo(this.size.width*0.35f, this.size.height*0.35f)
            it.lineTo(this.size.width*0.65f, this.size.height*0.5f)
            it.lineTo(this.size.width*0.35f, this.size.height*0.65f)
            it.close()
            it
        }
        drawRoundRect(color = Color.Red, cornerRadius = CornerRadius(20f, 20f))
        drawPath(path = trianglePath, color = Color.White)
    }
}

@Composable
@Preview
fun YoutubePreview(){
    ComposeCustomViewTheme {
        Youtube()
    }
}