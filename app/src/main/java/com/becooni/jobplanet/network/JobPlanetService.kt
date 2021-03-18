package com.becooni.jobplanet.network

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface JobPlanetService {

    @GET("/mobile-config/test_data.json")
    fun getTestData(): Single<Response<TestResponse>>
}