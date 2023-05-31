package view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import modelview.ListViewModel

@Composable
fun myComposeList(listViewModel: ListViewModel) {
    LazyColumn {
        // Add a single item
        item {
            Text(text = "First item")
        }

        // Add 5 items
        items(5) { index ->
            Text(text = "Item: $index")
        }

        // Add another single item
        item {
            Text(text = listViewModel.formattedTime)
        }

        items(listViewModel.listOfItems) { index ->
            Text(text = "$index")
        }
    }
}