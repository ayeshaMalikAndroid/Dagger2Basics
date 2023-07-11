package com.example.dagger2

import com.example.dagger2.qualifiers.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
              @MessageQualifier  private val notificationService: NotificationService
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"ayesha@gmail.com","User Registered.")
    }
}