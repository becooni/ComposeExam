package com.becooni.jobplanet.model

sealed class Resource<T> {
    class Success<T>(val data: T) : Resource<T>()
    class Error<T>(val message: String?) : Resource<T>()
}