package modelview

import androidx.compose.runtime.mutableStateListOf

class ListViewModel {

    var listOfItems = mutableStateListOf<String>()

    private var index = 0

    fun changeItem() {

        println("changeItem")

//        listOfItems.add(index++)

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