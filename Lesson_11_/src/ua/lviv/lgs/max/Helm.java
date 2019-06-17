package ua.lviv.lgs.max;

import java.awt.Choice;
import java.util.Arrays;

public class Helm {
	
	private double diameter;
	private String material;
	
	public Helm(double diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	
	public String chooseMaterial() {
		String material;
		int choice = (int)(Math.random()*2)+1;
		if(choice == 1) {
			material = "leather";
		}else {
			material = "alcantara";
		}
		return material;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", material=" + material + "]";
	}

}
