package com.manav.maven_demo;

public class Tyre {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

//	without setter the xml property tag will not work
	public void setBrand(String brand) {
		this.brand = brand;
	}

//	if using constructor then xml will use constructor to set values
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
}
