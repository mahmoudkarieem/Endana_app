package com.endana.app.presentation.screens.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier

            .padding(start = 16.dp, end = 16.dp, top = 6.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            modifier = Modifier.weight(1f)
        ) {
            Box(
                Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "ع",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        "ANDANA",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = (-0.45).sp
                    )
                    Box(
                        Modifier
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(Green)
                    )
                }
                Text(
                    "Zefta • Mit Ghamr Twin-Hub",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
        Row(
            Modifier
                .clip(CircleShape)
                .background(Color.Gray)
                .padding(2.dp)
        ) {
            listOf("AR" to true, "EN" to false).forEach { (label, isAr) ->

                Box(
                    Modifier
                        .clip(CircleShape)
//                            .background(if (selected) Color.Black else Color.Transparent)
                        .clickable { }
                        .padding(horizontal = 8.dp, vertical = 2.dp),
                ) {
                    Text(
                        label,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}