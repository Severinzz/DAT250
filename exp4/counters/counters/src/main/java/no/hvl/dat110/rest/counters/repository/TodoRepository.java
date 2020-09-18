package no.hvl.dat110.rest.counters.repository;

import no.hvl.dat110.rest.counters.data.Todo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TodoRepository {

    private static final String PERSISTENCE_UNIT_NAME = "todo";
    private static EntityManagerFactory factory;
    private static EntityManager em;

    public Todo createTodo(Todo todo){
        em.getTransaction().begin();
        Todo todo2 = em.merge(todo);
        em.getTransaction().commit();
        return todo2;
    }

    public Todo getTodo(long id){
        return em.find(Todo.class, id);
    }

    public List<Todo> getTodos(){
        return em.createQuery("select t from Todo t").getResultList();
    }

    public boolean deleteTodo(long id){
        Todo todo = em.find(Todo.class, id);
        em.getTransaction().begin();
        em.remove(todo);
        em.getTransaction().commit();
        return em.find(Todo.class, id) == null;
    }

    public Todo updateTodo(long id, String summary, String description){
        Todo todo = em.find(Todo.class, id);
        todo.setSummary(summary);
        todo.setDescription(description);
        em.getTransaction().begin();
        Todo updatedTodo = em.merge(todo);
        em.getTransaction().commit();
        return updatedTodo;
    }

    public TodoRepository setup(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        return this;
    }

}
