package com.example.tuwaiqfirstprojectforandroid
/*
 Create (Task) data class that holds these values: id, name, note and isCompleted has default value of false. Then create (Todo) class that do the following:
1) Show all the tasks (Method)
2) Print specific task, One parameter of type Int
3) Add task, Parameter of type Task (Method)
4) Remove task, Parameter of type task (Method)
4) Change task, Parameter of type Task (Method)
5) The Class has an array property called tasks of type (Task) which has a private set.
 */

class Todo() {

      var task: ArrayList<Task> = ArrayList()
          private set

    // 1) Show all Tasks
    fun showAllTasks() {
        for(task in this.task) {
            println(task)
        }
    }

    // 2) print specific task
    fun showTask(task:Int) {

        if(this.task.size> task) {
            println(this.task[task])
        }

        else
            println(" the element is not found in the array ")


    }
    // 3) add task
    fun addTask(task:Task) {

       this.task.add(task)
    }


    // 4) remove specific task
    fun removeTask(x:Task) {
        this.task.remove(x)

    }
}

data class Task (
        val id : String,
        val name :String,
        var note : String,
        var isCompleted: Boolean = false
)

fun main() {
    var task = Task(id="ffff",name = "ffff",note = "testing",true)
    var f = Todo()
    var task2 = Task(id="111",name = "111",note = "testing",true)
    f.addTask(task)
    f.showAllTasks()
    f.removeTask(task)
    f.addTask(task2)
    f.showAllTasks()
    f.showTask(0)

}