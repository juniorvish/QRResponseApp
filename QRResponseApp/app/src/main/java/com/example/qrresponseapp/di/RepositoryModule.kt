package com.example.qrresponseapp.di

import com.example.qrresponseapp.repository.QRResponseRepository
import com.example.qrresponseapp.api.QRResponseApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideQRResponseRepository(qrResponseApi: QRResponseApi): QRResponseRepository {
        return QRResponseRepository(qrResponseApi)
    }
}