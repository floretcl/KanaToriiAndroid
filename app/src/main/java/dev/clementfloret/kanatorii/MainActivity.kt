package dev.clementfloret.kanatorii

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.clementfloret.kanatorii.ui.theme.KanaToriiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KanaToriiTheme {
                Scaffold(
                    bottomBar = {
                        KanaToriiNavigationBar()
                    }
                ) { padding ->
                    HomeScreen(
                        Modifier
                            .padding(padding)

                    )
                }
            }
        }
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
fun GreetingPreview() {
    KanaToriiTheme {
        Scaffold(
            bottomBar = {
                KanaToriiNavigationBar()
            }
        ) { padding ->
            HomeScreen(
                Modifier
                    .padding(padding)
            )
        }
    }
}