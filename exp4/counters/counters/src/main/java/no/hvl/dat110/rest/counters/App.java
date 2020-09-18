package no.hvl.dat110.rest.counters;


import no.hvl.dat110.rest.counters.service.TodoService;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {

	private static TodoService todoService = new TodoService();

	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		after((req, res) -> {
  		  res.type("application/json");
  		});

		get("/todos", (req, res) ->  { return todoService.getTodo(req.queryParams("id")); } );

		get("/todos/all", (req, res) ->  { return todoService.getTodos(); } );

		post("/todos", (req, res) -> { return todoService.createTodo(req.body()); });

        delete("/todos", (req, res) -> { return todoService.deleteTodo(req.queryParams("id")); });

        put("/todos", (req,res) -> { return todoService.updateTodo(req.queryParams("id"), req.body()); });
    }

}
