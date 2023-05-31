package modelview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ListViewModel {

    var formattedTime by mutableStateOf("00:00:000")
    var listOfItems = mutableStateListOf<Int>()



    private var index = 0

    fun changeItem() {

        println("changeItem")

        formattedTime = "Changed"

        listOfItems.add(index++)

    }
}