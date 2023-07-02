package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Responsable extends Utilisateur {
	
	@Column(length = 20, nullable = false)
	private String nom;
	@Column(length = 20, nullable = false)
	private String prenom;
	
	

}
