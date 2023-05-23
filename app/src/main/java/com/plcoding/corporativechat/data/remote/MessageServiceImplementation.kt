package com.plcoding.corporativechat.data.remote

import com.plcoding.corporativechat.data.remote.dto.MessageDto
import com.plcoding.corporativechat.domain.model.Message
import io.ktor.client.*
import io.ktor.client.request.*

class MessageServiceImplementation(
    private val client: HttpClient
):MessageService {
    override suspend fun getAllMessages(): List<Message> {
        return try {
            client.get<List<MessageDto>>(MessageService.Endpoints.GetAllMessages.url)
                .map{ it.toMessage()}
        } catch(e:Exception){
            emptyList()
        }
    }
}