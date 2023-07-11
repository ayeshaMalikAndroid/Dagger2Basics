package com.example.dagger2

import com.example.dagger2.module.NotificationServiceModule
import com.example.dagger2.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
//component is a collection of dependencies
// that are used to create and manage other objects.
//@Component annotation takes a list of modules as its parameter. Modules
// are used to define the dependencies that are available to a component.
//@Component annotation can also be used to define methods that return dependencies.
// These methods are called provider methods.
@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {
    //return userRegistrationService object.
//    fun getUserRegistrationService() : UserRegistrationService
//    fun getEmailService() :EmailService
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    //used to create objects.
    //used to build components.
    interface Factory{
        fun create(@BindsInstance  retryCount : Int) : UserRegistrationComponent


    }
}