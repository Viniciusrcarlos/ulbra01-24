package com.example.apicomretrofit.data.network

import com.example.apicomretrofit.data.network.responses.CharactersResponse
import com.example.apicomretrofit.data.network.responses.ResultsResponse
import okhttp3.Response
import retrofit2.http.GET

interface CharactersApi {
    @GET("character")
    suspend fun fetchCharacters(): ResultsResponse
}