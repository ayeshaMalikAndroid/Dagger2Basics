package com.example.dagger2.module

import com.example.dagger2.EmailService
import com.example.dagger2.MsgService
import com.example.dagger2.NotificationService
import com.example.dagger2.qualifiers.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {
    @MessageQualifier
    @Provides
    //request dagger  pass value that have in component.
     @Singleton
    fun getMessageService(retryCount : Int) : NotificationService{
      return MsgService(retryCount)
    }
    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}