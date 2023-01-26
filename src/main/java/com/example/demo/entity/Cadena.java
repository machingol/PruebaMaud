package com.example.demo.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="BRAND")
@Entity


public class Cadena {

	   @Id
	   @GeneratedValue( strategy= GenerationType.AUTO ) 
	   private int id;



	   private String name;

	   public int getEid( ) 
	   {
	      return id;
	   }
	   public void setEid(int id)  
	   {
	      this.id = id;
	   }		
	   public String getName() {
			return name;
	   }	
	   public void setName(String name) {
			this.name = name;	
	   }

	
	   



}
