package com.example.apicomretrofit.data.di

import com.example.apicomretrofit.data.datasources.CharactersDataSource
import com.example.apicomretrofit.data.repositories.CharactersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule  {

    @Provides
    @Singleton
    fun providesCharactersRepository(dataSource: CharactersDataSource): CharactersRepository {
        return CharactersRepository(dataSource)
    }
}