package com.example.qrresponseapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.qrresponseapp.repository.QRResponseRepository
import com.example.qrresponseapp.api.RequestBody
import com.example.qrresponseapp.api.ResponseBody
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QRResponseViewModel @Inject constructor(
    private val repository: QRResponseRepository
) : ViewModel() {

    val responseText = MutableLiveData<String>()

    fun makePostRequest(url: String) {
        viewModelScope.launch {
            val requestBody = RequestBody(url)
            val response = repository.generateResponse(requestBody)
            displayResponse(response)
        }
    }

    private fun displayResponse(response: ResponseBody) {
        responseText.value = response.resp
    }
}