package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.module.NotificationServiceModule
import com.example.dagger2.qualifiers.MessageQualifier
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //Field Injection..
    @Inject
    lateinit var userRegistrationService :UserRegistrationService
    @Inject
   lateinit var emailService: EmailService
    @Inject
    lateinit var emailServices: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //manual dependency injection
        //constructor dependency injection...
//        val emailService = EmailService()
//        val userRepository = UserRepository()
////
//       val userRegistrationService = UserRegistrationService(userRepository,emailService)
      //  val userRegistrationService = DaggerUserRegistrationComponent.getUserRegistrationService()
        val component = DaggerUserRegistrationComponent.factory().create(12)
                //pass value runtime and have to create module object by your own
                //pass dynamic value
           //  .notificationServiceModule(NotificationServiceModule(45))

        component.inject(this)
//        val userRegistrationService = component.getUserRegistrationService()
//        val userEmailService = component.getEmailService()
        userRegistrationService.registerUser("ayesha@gmail.com","000000")
      //  userEmailService.send()
    }
}