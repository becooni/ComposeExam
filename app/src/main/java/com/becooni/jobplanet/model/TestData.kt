package com.becooni.jobplanet.model

import com.google.gson.annotations.SerializedName

data class TestData(
    val ranking: Int,
    @SerializedName("cell_type")
    val cellType: String,
    @SerializedName("interview_difficulty")
    val interviewDifficulty: Float,
    val name: String,
    @SerializedName("salary_avg")
    val salaryAvg: Int,
    @SerializedName("web_site")
    val webSite: String,
    @SerializedName("logo_path")
    val logoPath: String,
    @SerializedName("interview_question")
    val interviewQuestion: String,
    @SerializedName("company_id")
    val companyId: Int,
    @SerializedName("has_job_posting")
    val hasJobPosting: Boolean,
    @SerializedName("rate_total_avg")
    val rateTotalAvg: Float,
    @SerializedName("industry_id")
    val industryId: Int,
    @SerializedName("review_summary")
    val reviewSummary: String,
    val type: String,
    @SerializedName("industry_name")
    val industryName: String,
    @SerializedName("simple_desc")
    val simpleDesc: String
)
