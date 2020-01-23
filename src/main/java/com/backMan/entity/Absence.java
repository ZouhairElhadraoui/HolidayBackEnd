package com.backMan.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name ="absence")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Absence implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ; 
	private  String    type ; 
	private String  desrciption ; 
	private LocalDate startDate ; 
	private 	LocalDate endDate ; 
	
	@ManyToOne
	private  Employee employee; 
	@OneToMany(cascade = CascadeType.ALL)
	
	
	@OneToOne
	@JoinColumn(name = "idAbsenceType")
	private AbsenceType absenceType;
	
}
