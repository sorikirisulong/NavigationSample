package com.hsh.navigation.navigator.provider

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
internal interface StoreAccessor {
    fun getNavigatorStore(): NavigatorStore
}