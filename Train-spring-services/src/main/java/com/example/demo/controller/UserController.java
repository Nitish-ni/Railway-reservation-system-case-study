package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.TrainService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/search")
public class UserController {
	
	@Autowired
	private TrainService trainService;

    @GetMapping("/findAllTrains")
    public List<Train> getTrains(){
	return trainService.findAll();
	
}
    
    @GetMapping("/getTrainBetween/{startStation}:{endStation}")
	public List<Train> getTrainBetweenTwoStations(@PathVariable String startStation,@PathVariable String endStation) {
		
		 return trainService.getTrainBetweenTwoStations(startStation, endStation);
	}
    @GetMapping("/findAllTrains/{trainid}")
    public Optional<Train> getTrains(@PathVariable String trainid){
	return trainService.findById(trainid);
}
	
}