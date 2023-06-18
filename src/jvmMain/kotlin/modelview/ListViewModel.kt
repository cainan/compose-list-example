package modelview

import androidx.compose.runtime.mutableStateListOf

class ListViewModel {

    var listOfItems = mutableStateListOf<String>()

    fun changeItem(index: Int, edittedText: String) {
        println("changeItem:")
        listOfItems.removeAt(index)
        listOfItems.add(index, edittedText)
    }

    fun addItem(note: String) {
        println("addItem")
        listOfItems.add(note)
    }


    fun removeItem(note: String) {
        println("removeItem")
        listOfItems.remove(note)
    }

}