package dev.clementfloret.kanatorii

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.clementfloret.kanatorii.ui.theme.Green
import dev.clementfloret.kanatorii.ui.theme.OrangeDark
import dev.clementfloret.kanatorii.ui.theme.ShadowTopHome

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.torii),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(
                    colors = listOf(ShadowTopHome, Color.Transparent),
                    endY = 800.0f)
                )
        )
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(start = 22.dp, top = 22.dp),
                    colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White)
                ) {
                    Icon(
                        Icons.Default.Share,
                        contentDescription = stringResource(id = R.string.share)
                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(end = 22.dp, top = 22.dp),
                    colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White)
                ) {
                    Icon(
                        Icons.Default.Settings,
                        contentDescription = stringResource(id = R.string.settings)
                    )
                }
            }
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Text(
                text = stringResource(id = R.string.home_title),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                fontSize = 40.sp,
                style = TextStyle(
                    shadow = Shadow(Color.Black, Offset(2.0f, 2.0f), 16.0f)
                )
            )
            Text(
                text = stringResource(id = R.string.home_subtitle),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = OrangeDark,
                fontSize = 36.sp,
                style = TextStyle(
                    shadow = Shadow(Color.Black, Offset(2.0f, 2.0f), 8.0f)
                ),
                fontFamily = FontFamily(Font(R.font.yu_mincho_demibold_1))
            )
            Spacer(
                modifier = Modifier.height(22.dp)
            )
            Text(
                text = stringResource(id = R.string.home_description),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                fontSize = 16.sp,
                style = TextStyle(
                    shadow = Shadow(Color.Black, Offset(2.0f, 2.0f), 16.0f)
                ),
                maxLines = 2
            )
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    ElevatedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        shape = ButtonDefaults.shape,
                        colors = ButtonDefaults.buttonColors(containerColor = Green),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
                        ) {
                        Text(
                            stringResource(id = R.string.introduction),
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }
                    ElevatedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        shape = ButtonDefaults.shape,
                        colors = ButtonDefaults.buttonColors(containerColor = Green),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
                        ) {
                        Text(
                            stringResource(id = R.string.about),
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}