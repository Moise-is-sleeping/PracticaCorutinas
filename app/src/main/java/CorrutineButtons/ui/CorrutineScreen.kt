package CorrutineButtons.ui

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun MainScreen(viewModel: CorrutineViewModel){
    var loading = viewModel.loading
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
        Log.d("loading",loading.toString())
        if (!loading){
            CircularProgressIndicator()
        }else{
            Text(text = viewModel.message)
        }
        Button(
            onClick = {
                loading = true
                viewModel.fetchData()

        }) {
            Text(text = "Llamar Api")
        }

    }

}

