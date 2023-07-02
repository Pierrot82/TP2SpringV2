package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Chambre {
	
	// J'aimerais que le numéro de chambre soit unique mais uniquement pour un hotel donné
	// donc impossible d'utiliser @unique = true sur pour l'attribut numero (à résoudre)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChambre;
	@NonNull
	@Column(nullable = false)
	private int numero;
	@NonNull
	@Column(nullable = false)
	private double superficie;
	@NonNull
	@Column(nullable = false)
	private int etage;
	@NonNull
	@Column(nullable = false)
	private boolean disponibilite;
	@NonNull
	@Column(nullable = false)
	private double prix;

}
