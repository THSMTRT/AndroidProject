package com.example.coflow.data.firebase

import com.example.coflow.models.TaskModel
import com.example.coflow.models.UserModel

fun UserSchema.toDomain() : UserModel{
    return UserModel(
        id = this.uid,
        name = this.name,
        email = this.email
    )
}

fun UserModel.toSchema() : UserSchema{
    return UserSchema(
        uid = this.id,
        name = this.name,
        email = this.email
    )
}

fun TaskSchema.toDomain() : TaskModel {
    return TaskModel(
        id = this.id,
        title = this.title,
        description = this.description,
        deadline = this.deadline,
        status = this.status
    )
}

fun TaskModel.toSchema() : TaskSchema {
    return TaskSchema(
        id = this.id,
        title = this.title,
        description = this.description,
        deadline = this.deadline,
        status = this.status
    )
}