package com.becooni.jobplanet.network

import com.becooni.jobplanet.model.TestData
import com.google.gson.annotations.SerializedName

data class TestResponse(
    @SerializedName("minimum_interviews")
    val minimumInterviews: Int,
    @SerializedName("total_page")
    val totalPage: Int,
    @SerializedName("minimum_reviews")
    val minimumReviews: Int,
    @SerializedName("total_count")
    val totalCount: Int,
    val page: Int,
    @SerializedName("page_size")
    val pageSize: Int,
    @SerializedName("minimum_salaries")
    val minimumSalaries: Int,
    val items: List<TestData>
)
