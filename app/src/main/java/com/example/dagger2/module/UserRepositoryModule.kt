package com.example.dagger2.module

import com.example.dagger2.FirebaseRepository
import com.example.dagger2.SQLRepository
import com.example.dagger2.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }
    @Binds
    abstract fun  getSQLRepository(sqlRepository: SQLRepository) : UserRepository

}