package exercices;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class TodoList {

    private HashSet<String> todoArray;

    
    public static void main(String[] args) {
        TodoList myTodo = new TodoList();
        String todo = JOptionPane.showInputDialog("Entrez une tâche à faire");
        HashSet<String> theTodos = myTodo.addTodo(todo);
        myTodo.showTodos(theTodos);
        
    }
    
    public HashSet<String> addTodo(String todo) {
        todoArray = new HashSet<String>();
        todoArray.add("Learn React");
        todoArray.add("Do a todo project with Java");
        todoArray.add("Learn Figma");
        todoArray.add("Learn Figma");
        todoArray.add(todo);

        return todoArray;

        // JOptionPane.showMessageDialog(null,todoArray);
        // for(String taske : todoArray) {

        // }
        
        // System.out.println(todoArray);

    }

    public void showTodos(HashSet<String> todoArray) {
        todoArray.forEach(t -> System.out.println(t) );
    }
}