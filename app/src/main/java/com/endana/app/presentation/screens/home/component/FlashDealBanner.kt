package com.endana.app.presentation.screens.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlashDealBanner(modifier: Modifier = Modifier) {
    val shape = RoundedCornerShape(32.dp)

    Box(
        modifier
//            .fillMaxWidth()
            .clip(shape)
            .background(MaterialTheme.colorScheme.tertiaryContainer)

//            .border(1.dp, colors.border, shape)
//            .then(if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier),
    ) {

        Icon(
            painter = painterResource(com.endana.app.R.drawable.baseline_local_fire_department_24),
            contentDescription = null,
//            tint = colors.content.copy(alpha = 0.25f),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = 12.dp, y = 12.dp)
                .size(56.dp),
        )
        Column(
            Modifier
                .clip(CircleShape)
                .padding(16.dp)
                .background(MaterialTheme.colorScheme.tertiary),
            verticalArrangement = Arrangement.spacedBy(12.dp),

            ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "    FLASH BRIDGE DEAL    ",
                    Modifier
                        .padding(horizontal = 8.dp, vertical = 2.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(MaterialTheme.colorScheme.onTertiary),
                    color = MaterialTheme.colorScheme.tertiary,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.25.sp,
                )
                Row(
                    Modifier
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.1f))
                        .padding(horizontal = 8.dp, vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    Icon(
                        painter = painterResource(com.endana.app.R.drawable.baseline_schedule_24),
                        null,
                        modifier = Modifier.size(10.dp)
                    )
                    Text("Ends in 28m", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
            }
            Text(
                "Nile Rush Hour: 25% OFF on Charcoal Grills",
                fontSize = 15.sp,
                lineHeight = 18.75.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                "Use code RUSH25 across Zefta & Mit Ghamr   riverfront orders.",
                fontSize = 13.sp, lineHeight = 16.5.sp, color = Color.Black.copy(alpha = 0.8f),
                modifier = Modifier.padding(end = 80.dp),
            )
        }
    }
}