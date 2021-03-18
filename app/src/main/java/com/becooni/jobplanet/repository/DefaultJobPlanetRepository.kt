package com.becooni.jobplanet.repository

import com.becooni.jobplanet.model.Resource
import com.becooni.jobplanet.network.JobPlanetService
import com.becooni.jobplanet.network.TestResponse
import io.reactivex.Single
import javax.inject.Inject

class DefaultJobPlanetRepository @Inject constructor(
    private val jobPlanetService: JobPlanetService
) : JobPlanetRepository {

    override fun fetchTestData(): Single<Resource<TestResponse>> {
        return jobPlanetService.getTestData()
            .map {
                if (it.isSuccessful) {
                    val body = it.body()
                    if (body == null) {
                        Resource.Error("EMPTY DATA")
                    } else {
                        Resource.Success(body)
                    }
                } else {
                    Resource.Error(it.message())
                }
            }
    }
}