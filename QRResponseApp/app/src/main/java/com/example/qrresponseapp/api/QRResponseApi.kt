package com.example.qrresponseapp.api

import com.example.qrresponseapp.model.RequestBody
import com.example.qrresponseapp.model.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface QRResponseApi {

    @POST("/generate-response")
    suspend fun generateResponse(@Body requestBody: RequestBody): Response<ResponseBody>

}