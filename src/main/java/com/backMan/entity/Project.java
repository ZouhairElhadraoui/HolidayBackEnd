package com.backMan.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "project")
public class Project  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private  String name ; 
	private String  description; 
	private LocalDate  startDate; 
	private LocalDate endDate; 
	
	
	@OneToMany(mappedBy = "project")
	private Collection<EmployeeHasProject> employeeHasProjects; 


}
