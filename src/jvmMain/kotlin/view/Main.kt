package view

import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import modelview.ListViewModel

@Composable
@Preview
fun App() {
    val listViewModel = remember { ListViewModel() }

    MaterialTheme {
        Column {
            Button(onClick = {
                println("Button clicked")
                listViewModel.changeItem()
            }
            ) {
                Text("Load Values")
            }

            Spacer(Modifier.padding(5.dp))

            myComposeList(listViewModel)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
