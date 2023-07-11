package com.example.dagger2

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send(to:String,from:String,body:String?)
}


//Constructor Injection...
class EmailService @Inject constructor() : NotificationService{
    //send email to user
    override fun send(to:String,from:String,body:String?){
        Log.d(EmailService::class.simpleName, "send:Email sent... ")
    }
}

class MsgService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d(MsgService::class.simpleName,"msg sent...")
    }

}