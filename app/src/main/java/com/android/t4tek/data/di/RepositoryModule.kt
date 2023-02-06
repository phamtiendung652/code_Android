package com.android.t4tek.data.di

import com.android.t4tek.app.di.AppModule
import com.android.t4tek.data.repository.UserRepositoryImpl
import com.android.t4tek.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository():UserRepository{
        return UserRepositoryImpl()
    }
}