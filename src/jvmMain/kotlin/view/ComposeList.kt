package view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import modelview.ListViewModel

@Composable
fun ComposeList(listViewModel: ListViewModel) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
            .fillMaxHeight(),
        userScrollEnabled = true,
        contentPadding = PaddingValues(16.dp)
    ) {
        items(listViewModel.listOfItems) { note ->
            NotesCard(note = note, onClicked = {
                println("NotesCard clicked")
            })
        }

    }
}

@Composable
fun NotesCard(note: String, onClicked: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(1f)
            .padding(10.dp)
            .clickable(onClick = onClicked),
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .weight(80f)
                    .padding(10.dp),
                text = "$note"
            )

            Button(
                modifier = Modifier
                    .padding(10.dp),

                onClick = {
                    println("Remove button was clicked")
                }) {
                Text("Remove")
            }
        }
    }
}
