package com.example.qrresponseapp.di

import com.example.qrresponseapp.viewmodel.QRResponseViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
object ViewModelModule {

    @Provides
    fun provideQRResponseViewModel(qrResponseRepository: QRResponseRepository): QRResponseViewModel {
        return QRResponseViewModel(qrResponseRepository)
    }
}