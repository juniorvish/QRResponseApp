package com.example.qrresponseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.qrresponseapp.ui.QRResponseScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QRResponseApp()
        }
    }
}

@Composable
fun QRResponseApp(viewModel: QRResponseViewModel = hiltViewModel()) {
    val response by viewModel.response.collectAsState()

    QRResponseScreen(
        onSubmitButtonClick = { url -> viewModel.makePostRequest(url) },
        response = response
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QRResponseApp()
}