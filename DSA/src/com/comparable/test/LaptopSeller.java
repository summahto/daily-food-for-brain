package com.comparable.test;

import java.util.ArrayList;

public class LaptopSeller {
	
	public String brand;
	public ArrayList <String> models;
	public int ram;
	
	public LaptopSeller(String brand, ArrayList<String> models, int ram) {
		super();
		this.brand = brand;
		this.models = models;
		this.ram = ram;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ArrayList<String> getModels() {
		return models;
	}
	public void setModels(ArrayList<String> models) {
		this.models = models;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

	
}


class ContactData
{
    public String name;
    public String birthDate;
    public ArrayList<String> phoneNumbers;
    public int lastUpdateTime;
}

