package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email:String , password : String)
}


@Singleton
class SQLRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, password : String){
        Log.d(UserRepository::class.simpleName, "saveUser: User saved in Db...")
    }
}

class FirebaseRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, password : String){
        Log.d(UserRepository::class.simpleName, "saveUser: User saved in Firebase...")
    }
}