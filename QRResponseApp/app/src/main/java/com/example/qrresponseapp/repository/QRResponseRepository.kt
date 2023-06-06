package com.example.qrresponseapp.repository

import com.example.qrresponseapp.api.QRResponseApi
import com.example.qrresponseapp.model.RequestBody
import com.example.qrresponseapp.model.ResponseBody
import javax.inject.Inject

class QRResponseRepository @Inject constructor(private val api: QRResponseApi) {

    suspend fun generateResponse(requestBody: RequestBody): ResponseBody {
        return api.generateResponse(requestBody)
    }
}