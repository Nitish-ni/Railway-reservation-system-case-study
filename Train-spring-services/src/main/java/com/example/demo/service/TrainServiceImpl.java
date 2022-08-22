package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepository;


@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainrepository;


	public Train addTrain (Train train) {
		return trainrepository.save(train);
	}

	public List<Train> getContact() {
		List<Train> train = trainrepository.findAll();
		System.out.println("Getting data from DB : " + train);
		return train;
	}

	public Optional<Train> getTrainbyId(String id) {
		return trainrepository.findById(id);
	}

	public void deleteTrain(Train train) {
		trainrepository.delete(train);
	}

	
	public void save(Train train) {
		trainrepository.save(train);
		
	}

	
	public Optional<Train> findById(String trainid) {
		return trainrepository.findById(trainid);
	}

	
	public void deleteById(String trainid) {
		trainrepository.deleteById(trainid);
		
	}
	public List<Train> getTrainBetweenTwoStations(String startStation,String endStation){
		List<Train> list=trainrepository.findAll();
		return list.stream().filter(data->data.getStartStation().equals(startStation)&& data.getEndStation().equals(endStation)).collect(Collectors.toList());
	}


	public List<Train> findAll() {
		return trainrepository.findAll();
	}


	

}
