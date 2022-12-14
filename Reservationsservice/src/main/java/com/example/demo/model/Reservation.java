package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "Orders")
public class Reservation {
	
	@Id
	private String id;
	private String quantity;
	private String startStation;
	private String endStation;
	
	public Reservation() {
		
	}

	public Reservation(String id, String quantity, String startStation, String endStation) {
		this.id = id;
		this.quantity = quantity;
		this.startStation = startStation;
		this.endStation = endStation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + ", startStation=" + startStation + ", endStation="
				+ endStation + "]";
	}


	

	

	

}