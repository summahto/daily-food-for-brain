package com.comparable.test;

public class Laptop implements Comparable<Laptop>{
	
	private String brand;
	private String model;
	private int ram;
	private int price;
	
	

	public Laptop(String brand, String model, int ram, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Laptop lap) {
		
		if(this.getRam() > lap.getRam())
			return 1;
		else
			return -1;
		
	}
	
	
	
}
