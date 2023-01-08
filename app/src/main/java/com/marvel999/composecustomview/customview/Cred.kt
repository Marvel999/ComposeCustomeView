package com.marvel999.composecustomview.customview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marvel999.composecustomview.ui.theme.ComposeCustomViewTheme

@Composable
fun Cred(){
    Canvas(modifier = Modifier.size(100.dp)){
        val CredPath = Path().let {
            it.moveTo()
        }
        drawRoundRect(color = Color.Black, cornerRadius = CornerRadius(20f, 20f))

    }
}

@Preview
@Composable
fun CredPreview(){
    ComposeCustomViewTheme {
        Cred()
    }
}