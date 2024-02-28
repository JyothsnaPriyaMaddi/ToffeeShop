package com.jyo.toffee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Toffee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String toffeeName;
	private double toffeePrice;
	private String toffeeManufacturingCountry;
	private double rating;
	private String review;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToffeeName() {
		return toffeeName;
	}
	public void setToffeeName(String toffeeName) {
		this.toffeeName = toffeeName;
	}
	public double getToffeePrice() {
		return toffeePrice;
	}
	public void setToffeePrice(double toffeePrice) {
		this.toffeePrice = toffeePrice;
	}
	public String getToffeeManufacturingCountry() {
		return toffeeManufacturingCountry;
	}
	public void setToffeeManufacturingCountry(String toffeeManufacturingCountry) {
		this.toffeeManufacturingCountry = toffeeManufacturingCountry;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
