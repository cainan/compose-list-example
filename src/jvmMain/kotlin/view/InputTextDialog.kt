package view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import modelview.ListViewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ShowDialog(
    dialogState: MutableState<Boolean>,
    index: MutableState<Int>,
    textToEdit: MutableState<String>,
    listViewModel: ListViewModel
) {

    Dialog(
        visible = dialogState.value,
        onCloseRequest = { dialogState.value = false },
        resizable = false
    ) {

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Edit your note:"
            )
            OutlinedTextField(
                modifier = Modifier.padding(10.dp).fillMaxWidth(),
                singleLine = true,
                value = textToEdit.value,
                label = {
                    Text(text = "")
                },
                onValueChange = {
                    textToEdit.value = it
                }
            )

            Row(
                modifier = Modifier.padding(10.dp).align(Alignment.End)
            ) {
                Button(
                    modifier = Modifier.padding(10.dp),
                    onClick = {
                        println("Cancel clicked")
                        dialogState.value = false
                    }

                ) {
                    Text("Cancel")
                }

                Button(
                    modifier = Modifier.padding(10.dp),
                    onClick = {
                        println("Ok clicked")
                        dialogState.value = false
                        listViewModel.changeItem(index.value, textToEdit.value)
                    }
                ) {
                    Text("Ok")
                }
            }
        }
    }
}

