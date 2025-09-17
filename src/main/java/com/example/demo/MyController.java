package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	MyRepo repo;
	@PostMapping("/")
	public Customer addCustomer(@RequestBody Customer c)
	{
		return this.repo.save(c);
	}
	@GetMapping("/")
	public List<Customer> show()
	{
		return this.repo.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Customer> showById(@PathVariable int id)
	{
		return this.repo.findById(id);
	}
}
