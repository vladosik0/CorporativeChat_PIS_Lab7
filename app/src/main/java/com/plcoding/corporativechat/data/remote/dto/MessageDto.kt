package com.plcoding.corporativechat.data.remote.dto

import android.text.format.Time
import com.plcoding.corporativechat.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
){
    fun toMessage(): Message {
        val simpleDateFormat = SimpleDateFormat("dd MMMM yyyy, HH:mm", Locale.UK)
//        val date = Date(timestamp)
//        val formattedDate = DateFormat
//            .getDateInstance(DateFormat.DEFAULT)
//            .format(date)
        return Message(
            text = text,
            formattedTime = simpleDateFormat.format(timestamp),
            username = username
        )
    }
}