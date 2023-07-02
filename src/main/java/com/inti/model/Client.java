package com.inti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor @ NoArgsConstructor 
public class Client extends Utilisateur {

	@Column(length = 30, nullable = false)
	private String nom;
	@Column(length = 30, nullable = false)
	private String prenom;
	@Column(length = 50, nullable = false)
	private String adresse;
	@Column(length = 30, nullable = false)
	private String email;
	@Column(length = 10)
	private String telephone;
}
