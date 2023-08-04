package com.example.concesionaria

import com.example.concesionaria.data.EnvironmentDetailsResponse
import com.example.concesionaria.data.HousesEnvironmentResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("/houses")

    suspend fun getRandomHouse(): HousesEnvironmentResponse

    @GET("/houses/environment/detail/{id}")

    suspend fun getDetailsHouse(@Path("{id}") id: String): EnvironmentDetailsResponse

    @GET("/houses/environment/{id}")

    suspend fun getEnvironment(@Path("{id}") id: String): HousesEnvironmentResponse


}