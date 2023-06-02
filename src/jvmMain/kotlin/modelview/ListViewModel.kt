package modelview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ListViewModel {

    var listOfItems = mutableStateListOf<String>()

    private var index = 0

    fun changeItem() {

        println("changeItem")

//        listOfItems.add(index++)

    }

    fun addItem() {
        println("changeItem")

        listOfItems.add("My note number ${index++}")
    }
}