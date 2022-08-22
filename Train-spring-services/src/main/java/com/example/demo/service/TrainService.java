package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Train;

public interface TrainService {
	public Train addTrain (Train train);
	public List<Train> getContact();
	public Optional<Train> getTrainbyId(String id);
	public void deleteTrain(Train train);
	public void save(Train trainid);
	public Optional<Train> findById(String trainid);
	public void deleteById(String trainid);
	public List<Train> getTrainBetweenTwoStations(String startStation,String endStation);
	public List<Train> findAll();
}

