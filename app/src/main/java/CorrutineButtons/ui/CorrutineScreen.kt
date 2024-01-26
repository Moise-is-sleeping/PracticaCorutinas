package CorrutineButtons.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen(viewModel: CorrutineViewModel){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Button(
            colors =ButtonDefaults.buttonColors(containerColor = Color(viewModel.color)),
            onClick = {
                viewModel.buttonColor()
            }) {
            Text(text = "Change Color")
        }

        Text(text = viewModel.message)
        Button(
            onClick = {
                viewModel.fetchData()
        }) {
            Text(text = "Llamar Api")
        }
    }

}