package com.vicky.Hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VickyTable")
public class Alien { // POJO
	
	@Id
	private int a_Id;
	private String a_Name;
	private String a_Colour;
	
	public int getA_Id() {
		return a_Id;
	}
	public void setA_Id(int a_Id) {
		this.a_Id = a_Id;
	}
	public String getA_Name() {
		return a_Name;
	}
	public void setA_Name(String a_Name) {
		this.a_Name = a_Name;
	}
	public String getA_Colour() {
		return a_Colour;
	}
	public void setA_Colour(String a_Colour) {
		this.a_Colour = a_Colour;
	}
	
	@Override
	public String toString() {
		return "Alien [a_Id=" + a_Id + ", a_Name=" + a_Name + ", a_Colour=" + a_Colour + "]";
	}	

}
