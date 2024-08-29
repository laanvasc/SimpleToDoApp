package com.example.simpletodoapp

import java.util.Date


data class ToDo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getFakeToDo(): List<ToDo> {
    return listOf<ToDo>(
        ToDo(1, "Task 1", Date(2023, 1, 1)),
        ToDo(2, "Task 2", Date(2022, 1, 1)),
        ToDo(3, "Task 3", Date(2021, 1, 1)),
    )
}

