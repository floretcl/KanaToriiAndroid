package dev.clementfloret.kanatorii

import android.content.res.Configuration
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.clementfloret.kanatorii.ui.theme.Grey
import dev.clementfloret.kanatorii.ui.theme.KanaToriiTheme
import dev.clementfloret.kanatorii.ui.theme.Orange
import dev.clementfloret.kanatorii.ui.theme.OrangeDark
import dev.clementfloret.kanatorii.ui.theme.Shadow
import dev.clementfloret.kanatorii.ui.theme.ShadowTopHome

@Composable
fun KanaToriiNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier,


    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_home_24),
                    contentDescription = stringResource(id = R.string.home)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.home)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_format_list_bulleted_24),
                    contentDescription = stringResource(id = R.string.lists)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.lists)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {

                Icon(
                    painter = painterResource(id = R.drawable.baseline_menu_book_24),
                    contentDescription = stringResource(id = R.string.lessons)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.lessons)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_quiz_24),
                    contentDescription = stringResource(id = R.string.quiz)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.quiz)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_bar_chart_24),
                    contentDescription = stringResource(id = R.string.stats)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.stats)
                )
            }
        )
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight",
    showBackground = true
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark",
    showBackground = true
)
@Composable
fun NavigationBarPreview() {
    KanaToriiTheme {
        KanaToriiNavigationBar()
    }
}