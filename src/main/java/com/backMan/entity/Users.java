package com.backMan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "users")
public class Users  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private  String firstName; 
	private  String lastName; 
	private String email; 
	private String password ; 
	private String photo ; 
	   
	
	@OneToOne(mappedBy = "user")
	private Employee employee; 
	

}
