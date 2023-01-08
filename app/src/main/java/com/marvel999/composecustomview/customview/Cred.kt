package com.marvel999.composecustomview.customview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marvel999.composecustomview.ui.theme.ComposeCustomViewTheme

@Composable
fun Cred() {
        Canvas(modifier = Modifier.size(90.dp)) {
            val credPath = Path().let {
                it.moveTo((this.size.width) * 0.20f, (this.size.height) * 0.10f)
                it.lineTo((this.size.width) * 0.80f, (this.size.height) * 0.10f)
                it.lineTo((this.size.width) * 0.80f, (this.size.height) * 0.60f)
                it.lineTo((this.size.width) * 0.50f, (this.size.height) * 0.90f)
                it.lineTo((this.size.width) * 0.20f, (this.size.height) * 0.60f)
                it.close()
                it.moveTo((this.size.width) * 0.40f, (this.size.height) * 0.15f)
                it.lineTo((this.size.width) * 0.75f, (this.size.height) * 0.15f)
                it.lineTo((this.size.width) * 0.75f, (this.size.height) * 0.30f)
                it.moveTo((this.size.width) * 0.65f, (this.size.height) * 0.20f)
                it.lineTo((this.size.width) * 0.25f, (this.size.height) * 0.20f)
                it.lineTo((this.size.width) * 0.25f, (this.size.height) * 0.55f)
                it.lineTo((this.size.width) * 0.50f, (this.size.height) * 0.80f)
                it.lineTo((this.size.width) * 0.75f, (this.size.height) * 0.55f)
                it.lineTo((this.size.width) * 0.75f, (this.size.height) * 0.45f)
                it.moveTo((this.size.width) * 0.30f, (this.size.height) * 0.30f)
                it.lineTo((this.size.width) * 0.30f, (this.size.height) * 0.50f)
                it.lineTo((this.size.width) * 0.50f, (this.size.height) * 0.70f)
                it.lineTo((this.size.width) * 0.68f, (this.size.height) * 0.52f)
                it
            }
            drawRoundRect(color = Color.Black, cornerRadius = CornerRadius(20f, 20f))
            drawPath(
                path = credPath,
                color = Color.White,
                style = Stroke(width = 6f, cap = StrokeCap.Square)
            )
        }
    }

@Preview
@Composable
fun CredPreview() {
    ComposeCustomViewTheme {
        Cred()
    }
}