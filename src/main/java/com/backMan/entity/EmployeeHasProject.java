package com.backMan.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class EmployeeHasProject implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
    private LocalDate startDate ; 
	private LocalDate endDate ; 
	private Integer  dedication ; 
	
	@ManyToOne
	private Employee employee;
	
	@ManyToOne
	private Project project; 
	
	
	
	
	
	
	
}

	


