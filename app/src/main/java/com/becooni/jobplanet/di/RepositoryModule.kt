package com.becooni.jobplanet.di

import com.becooni.jobplanet.repository.DefaultJobPlanetRepository
import com.becooni.jobplanet.repository.JobPlanetRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindDefaultJobPlanetRepository(
        defaultJobPlanetRepository: DefaultJobPlanetRepository
    ): JobPlanetRepository
}
