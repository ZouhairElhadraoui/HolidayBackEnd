package com.backMan.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "employee")

public class Employee implements  Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private   LocalDate  hireDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private Users user; 
	
	
	@OneToMany(mappedBy = "employee")
	private Collection<Skill> skills; 
	
	@OneToMany(mappedBy = "employee")
	private Collection<EmployeeHasProject> employeeHasProjects; 
	
	@OneToMany(mappedBy = "employee")
	private Collection<Absence> Absences; 
	
	

}
