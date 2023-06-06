package view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import modelview.ListViewModel

@Composable
@Preview
fun App() {
    val listViewModel = remember { ListViewModel() }
    var note by remember { mutableStateOf(TextFieldValue("")) }

    MaterialTheme {
        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                OutlinedTextField(
                    modifier = Modifier.weight(65f)
                        .padding(10.dp),
                    value = note,
                    label = { Text(text = "Add a note") },
                    onValueChange = {
                        note = it
                    }
                )

                Button(
                    modifier = Modifier.padding(10.dp),
                    onClick = {
                        println("Button clicked")
                        listViewModel.addItem(note.text)
                        note = TextFieldValue("")
                    }

                ) {
                    Text("Add note")
                }

            }

            Spacer(Modifier.padding(5.dp))

            ComposeList(listViewModel)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
