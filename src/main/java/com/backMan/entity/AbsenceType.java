package com.backMan.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "absenceType")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AbsenceType  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	private String type ; 
	private String description ; 
	private LocalDate startDate ; 
	private LocalDate endDate ; 
	
	@OneToOne(mappedBy = "absenceType")
	private Absence absence; 

}
