package com.inti.model;

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
@AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idUtilisateur;
	@NonNull
	@Column(length = 50, unique = true , nullable = false)
	protected String login;
	@NonNull
	@Column(unique = true, nullable = false)
	protected String mdp;
	

}
