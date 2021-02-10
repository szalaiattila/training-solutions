package intromethods;

import java.util.Arrays;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("Egyes");
        todoList.addTodo("Kettes");
        todoList.addTodo("Háromas");
        todoList.addTodo("Négyes");

        System.out.println(todoList);

        todoList.finishTodos("Négyes");
        todoList.finishAllTodos(Arrays.asList("Kettes", "Háromas"));


        System.out.println(todoList);

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());



    }
}
