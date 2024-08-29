package com.example.simpletodoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToDoViewModel : ViewModel() {

    private var _todoList = MutableLiveData<List<ToDo>>()
    val todoList: LiveData<List<ToDo>> = _todoList

    fun getAllTodo() {
        _todoList.value = ToDoManager.getAllTodo().reversed()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String) {
        ToDoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id: Int){
        ToDoManager.deleteTodo(id)
        getAllTodo()
    }


}