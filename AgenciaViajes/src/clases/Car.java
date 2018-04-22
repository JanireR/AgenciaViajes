package server.data;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.*;


@PersistenceCapable(detachable="true")
public class Car implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey
	private int ID;
	private String colour;
	private String model;
	private String type;
	private List<String> accesories;
	private String brand;

	
	public Car(int ID, String colour, String model, String type,List <String> accesories, String brand){
		this.ID = ID;
		this.colour = colour;
		this.model = model;
		this.type = type;
		this.accesories = accesories;
		this.brand = brand;
		
	}
	

	@Persistent(defaultFetchGroup="true", mappedBy="car", dependentElement="true")
	@Join	
	List<Review> reviews = new ArrayList<Review>();
	
	@Persistent(defaultFetchGroup="true", dependentElement="true")
	@Join	
	List<User> users = new ArrayList<User>();
	
	public List<User> getUsers(){
		return this.users;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public List<String> accesories(){
		return this.accesories;
	}
	public void setAccesories(List<String> accesories){
		this.accesories = accesories;
	}

	public String toString() {
		 return "Car: ID --> " + this.ID + ", brand -->  " + this.brand + ",  model -->  " + this.model + ", type --> "+ this.type + " colour -->  " + this.colour + ", accesories --> "+ this.accesories;
	}
}