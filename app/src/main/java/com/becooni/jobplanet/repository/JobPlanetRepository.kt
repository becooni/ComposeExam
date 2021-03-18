package com.becooni.jobplanet.repository

import com.becooni.jobplanet.model.Resource
import com.becooni.jobplanet.network.TestResponse
import io.reactivex.Single

interface JobPlanetRepository {

    fun fetchTestData(): Single<Resource<TestResponse>>
}