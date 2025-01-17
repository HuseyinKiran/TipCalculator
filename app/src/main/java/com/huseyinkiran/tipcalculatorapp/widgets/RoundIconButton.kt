package com.huseyinkiran.tipcalculatorapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 1.0f),
    backgroundColor: Color = Color.White,
    elevation: Dp = 4.dp
) {
    Card(
        modifier = modifier.padding(all = 4.dp).clickable { onClick.invoke() },
        shape = CircleShape,
        colors = CardDefaults.cardColors(backgroundColor),
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Box(
            modifier = Modifier.size(40.dp), contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = imageVector, contentDescription = "Plus or Minus Icon", tint = tint)
        }
    }
}