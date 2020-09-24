package no.hvl.dat110.rest.counters.service;

import com.google.gson.Gson;
import no.hvl.dat110.rest.counters.data.Todo;
import no.hvl.dat110.rest.counters.repository.TodoRepository;

import java.util.List;

public class TodoService {

    private TodoRepository todoRepository = new TodoRepository().setup();

    private Gson gson = new Gson();

    public Todo createTodo(String body){
        return todoRepository.createTodo(gson.fromJson(body, Todo.class));
    }

    public Todo getTodo(String id){
        long idInLong = Long.parseLong(id);
        return todoRepository.getTodo(idInLong);
    }

    public List<Todo> getTodos(){
        return todoRepository.getTodos();
    }

    public boolean deleteTodo(String id){
        long idInLong = Long.parseLong(id);
        return todoRepository.deleteTodo(idInLong);
    }

    public Todo updateTodo(String id, String body){
        long idInLong = Long.parseLong(id);
        Todo todo = gson.fromJson(body, Todo.class);
        String newDescription = todo.getDescription();
        String newSummary = todo.getSummary();
        return todoRepository.updateTodo(idInLong, newSummary, newDescription);
    }
}
