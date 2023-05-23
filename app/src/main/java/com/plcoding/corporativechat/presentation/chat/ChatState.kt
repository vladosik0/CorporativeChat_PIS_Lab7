package com.plcoding.corporativechat.presentation.chat

import com.plcoding.corporativechat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)