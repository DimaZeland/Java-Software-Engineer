/**
 * 
 */
package com.demo.controllers;

import com.demo.entities.Todo;
import com.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class TodoRestController {

	@Autowired
	private TodoRepository todoRepository;
	
	@GetMapping("/api/todos/list")
	public List<Todo> findAll(){
		return todoRepository.findAll();
	}
	
	@GetMapping("/api/todos/{id}")
	public Optional<Todo> findById(@PathVariable Integer id){
		return todoRepository.findById(id);
	}
	
	@PostMapping("/api/todos")
	public Todo createTodo(@RequestBody Todo todo){
		return todoRepository.save(todo);
	}
}
