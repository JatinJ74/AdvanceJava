package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired  //field injection
	public Lenevo lenovo;
	
	
//	public Lenevo lenevo; //Constructor injection
//	
//	public Laptop(Lenevo lenevo) {
//		this.lenevo = lenevo;
//	}
	
//	@Autowired 
//	public Lenevo lenovo;  //Setter injection
//	
//	public void setLenovo(Lenevo lenovo) {
//		this.lenovo = lenovo;
//	}
	
	
	public void start(){
		System.out.println("Initializing Laptop");
		lenovo.Started();
	}
	

}
