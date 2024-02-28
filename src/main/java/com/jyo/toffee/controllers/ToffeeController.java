package com.jyo.toffee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jyo.toffee.entities.Toffee;
import com.jyo.toffee.repository.ToffeeRepository;

@RestController
public class ToffeeController {

	@Autowired
	ToffeeRepository repo;
	//					Get Request
	@RequestMapping(method = RequestMethod.GET, value = "/toffees")
	public List<Toffee> getAllToffess() {
		return repo.findAll();
	}
	// 					Get By ID
	@RequestMapping(method = RequestMethod.GET, value="/toffee/{id}")
	public Toffee getSingleToffee(@RequestBody Toffee toffee, @PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	// 					POST Request
	@RequestMapping(method=RequestMethod.POST, value = "/toffees")
	public String createProduct(@RequestBody Toffee toffee) {
		repo.save(toffee);
		return "created";
	}
	// 					PUT Request
	@RequestMapping(method=RequestMethod.PUT, value="/toffee/{id}")
	public String updateToffee(@RequestBody Toffee toffee, @PathVariable("id") int id) {
		toffee.setId(id);
		repo.save(toffee);
		return "Updated";
	}
	//					PATCH Request
	@RequestMapping(method=RequestMethod.PATCH, value="/toffee/{id}")
	public String patchUpdateToffee(@PathVariable("id") int id, @RequestBody Toffee toffee) {
		Toffee existingToffee = repo.findById(id).get();
		if(toffee.getToffeeName() != null) {
			existingToffee.setToffeeName(toffee.getToffeeName());
		}
		if(toffee.getRating() != 0) {
			existingToffee.setRating(toffee.getRating());
		}
		if(toffee.getReview() != null) {
			existingToffee.setReview(toffee.getReview());
		}
		if(toffee.getToffeeManufacturingCountry() != null) {
			existingToffee.setToffeeManufacturingCountry(toffee.getToffeeManufacturingCountry());
		}
		if(toffee.getToffeePrice() != 0) {
			existingToffee.setToffeePrice(toffee.getToffeePrice());
		}
		repo.save(existingToffee);
		return "patch update";
	}
	//					DELETE Request
	@RequestMapping(method=RequestMethod.DELETE, value="/toffee/{id}")
	public String deleteToffee(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "deleted";
	}
	
}
