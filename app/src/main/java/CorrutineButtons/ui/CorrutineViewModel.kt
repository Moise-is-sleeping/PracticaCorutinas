package CorrutineButtons.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CorrutineViewModel :ViewModel(){
    var redOrBlue by mutableStateOf(false)
    var counter by mutableStateOf(0)
    var message by mutableStateOf("")
    var color by mutableStateOf(0xFF992D31)
    var loadingg by mutableStateOf(true)

    fun buttonColor() {
        if (redOrBlue){
            redOrBlue = false
            color = 0xFF992D31
        }else{
            redOrBlue = true
            color = 0xFF2D4499
        }
    }

    fun fetchData(){
        counter+=1
        viewModelScope.launch{
            val result = withContext(Dispatchers.IO){
                delay(5000)
                "Api response : $counter"
            }
            message = result
        }
    }

}
