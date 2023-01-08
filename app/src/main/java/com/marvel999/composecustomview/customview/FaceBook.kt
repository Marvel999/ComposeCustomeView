package com.marvel999.composecustomview.customview

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.marvel999.composecustomview.R
import com.marvel999.composecustomview.ui.theme.ComposeCustomViewTheme

@Composable
fun Facebook() {
    val customTypeface = ResourcesCompat.getFont(LocalContext.current, R.font.klavika_bold)

    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 290f
        color = Color.White.toArgb()
        typeface = customTypeface
    }
    Canvas(modifier = Modifier.size(100.dp)){

        drawRoundRect(color = Color(0xFF1776d1), cornerRadius = CornerRadius(20f, 20f))
        drawContext.canvas.nativeCanvas.drawText("f", this.size.center.x+25, this.size.center.y+140,paint)
    }
}

@Preview
@Composable
fun FacebookPreview(){
    ComposeCustomViewTheme {
        Facebook()
    }
}

