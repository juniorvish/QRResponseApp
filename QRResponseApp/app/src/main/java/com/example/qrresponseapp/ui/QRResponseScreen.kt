package com.example.qrresponseapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.qrresponseapp.viewmodel.QRResponseViewModel

@Composable
fun QRResponseScreen(viewModel: QRResponseViewModel) {
    val url = remember { mutableStateOf("") }
    val response = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = url.value,
            onValueChange = { newValue -> url.value = newValue },
            label = { Text("Enter URL") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri),
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                viewModel.makePostRequest(url.value) { result ->
                    response.value = result
                }
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Submit")
        }

        Text(
            text = response.value,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}