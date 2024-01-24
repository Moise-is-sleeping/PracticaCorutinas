package CorrutineButtons.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun MainScreen(){
    val viewModel by remember { mutableStateOf(CorrutineViewModel()) }
    var buttonColor by remember { mutableStateOf(0xFF992D31) }
    var displayText by remember { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        Button(
            colors =ButtonDefaults.buttonColors(containerColor = Color(buttonColor)),
            onClick = {
                buttonColor = viewModel.buttonColor()
            }) {
            Text(text = "Change Color")
        }
        Text(text = displayText)
        Button(onClick = {
            displayText = viewModel.blockApp()
        }) {
            Text(text = "Llamar Api")
        }

    }
}