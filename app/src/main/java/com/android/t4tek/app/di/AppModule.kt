package com.android.t4tek.app.di

import android.content.Context
import com.android.t4tek.app.MainApplication
import com.android.t4tek.data.di.RepositoryModule
import com.android.t4tek.data.repository.UserRepositoryImpl
import com.android.t4tek.domain.repository.UserRepository
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideApplicationContext(app: MainApplication): Context {
        return app.applicationContext
    }
}