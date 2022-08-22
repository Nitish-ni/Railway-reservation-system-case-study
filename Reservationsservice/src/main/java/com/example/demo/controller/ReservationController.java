package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;

@RestController
	
	@RequestMapping("/orders")
	public class ReservationController {
		
		@Autowired
		private ReservationRepository bookrepository;

		@PostMapping("/addOrder")
		public String saveBook(@RequestBody Reservation book) {
		bookrepository.save(book);
		return "Booked ticket with id :  " + book.getId();
	    }
		@GetMapping("/{id}")
		public Optional<Reservation> getBook(@PathVariable String id){
			return bookrepository.findById(id);
		}
		@PutMapping("/update/{id}")
		public Reservation updateOrder(@PathVariable("id") String id,@RequestBody Reservation order ) {
			order.setId(id);
			bookrepository.save(order);
			return order;
		}
			
		 @DeleteMapping("/del/{id}")
		 public String deleteOrder (@PathVariable String id) {
		  bookrepository.deleteById(id);
			return "Order deleted with id : "+id;
			}
		}

	


