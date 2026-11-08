import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.endana.app.presentation.screens.home.model.Store


@Composable
fun StoreCard(
    store: Store,
    modifier: Modifier = Modifier,
    imageHeight: Dp = 112.dp,
    onClick: (Store) -> Unit,
) {
    val scheme = MaterialTheme.colorScheme

    Card(
        onClick = { onClick(store) },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = scheme.surface),
        elevation = CardDefaults.cardElevation(1.dp),
    ) {
        Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            // TODO: replace the gradient with the store photo, e.g. Coil AsyncImage(model = store.imageUrl, ...)
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(imageHeight)
                    .clip(RoundedCornerShape(12.dp))

            ) {
                Image(
                    painter = painterResource(id = store.imageRes),
                    contentDescription = store.name,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop
                )
                Text(
                    store.eta,
                    Modifier
                        .align(Alignment.TopStart)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .background(scheme.secondary)
                        .padding(horizontal = 8.dp, vertical = 2.dp),
                    color = scheme.onSecondary,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )
                // Rating pill
                Row(
                    Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .background(scheme.surface.copy(alpha = 0.9f))
                        .padding(horizontal = 8.dp, vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                ) {
                    Icon(
                        painter = painterResource(com.endana.app.R.drawable.baseline_apartment_24),
                        null,
                        tint = scheme.tertiary,
                        modifier = Modifier.size(11.dp)
                    )
                    Text(
                        store.rating,
                        color = scheme.onSurface,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top,
            ) {
                Column(Modifier.weight(1f)) {
                    Text(store.name, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    Text(
                        store.subtitle,
                        fontSize = 11.sp,
                        color = scheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                Icon(
                    painter = painterResource(com.endana.app.R.drawable.outline_arrow_forward_24),
                    null,
                    tint = scheme.secondary,
                    modifier = Modifier.size(12.dp),
                )
            }
        }
    }
}
