package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Salarie extends Utilisateur {
	
	@Column(length = 20, nullable = false)
	private String type;
	@Column(nullable = false)
	private LocalDate dateNaissance;
	@Column(nullable = false)
	private LocalDate dateEmbauche;

}
