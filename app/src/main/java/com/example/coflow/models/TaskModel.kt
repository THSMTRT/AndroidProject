package com.example.coflow.models

import java.time.LocalDateTime

data class TaskModel(
    val id: String = "",
    val title: String = "",
    val description: String = "",
//    val projectId: String = "",
//    val authorId: UserModel? = null,
    val assigneeIds: List<UserModel> = emptyList(),
    val deadline: LocalDateTime = LocalDateTime.now(),
    val status: TaskStatus = TaskStatus.TODO,
    //val isMine: Boolean = true
)