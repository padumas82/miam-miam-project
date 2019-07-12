package io.ldnr.miamProject.miammiamproject.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ingredient;
	private String nom_ingredient;
	private Float prix_ingredient;
	private static final long serialVersionUID = 1L;

	public Ingredient() {
	}

	public Ingredient(String nom_ingredient, Float prix_ingredient) {
		this.nom_ingredient = nom_ingredient;
		this.prix_ingredient = prix_ingredient;
	}

	public int getId_ingredient() {
		return id_ingredient;
	}

	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}

	public String getNom_ingredient() {
		return nom_ingredient;
	}

	public void setNom_ingredient(String nom_ingredient) {
		this.nom_ingredient = nom_ingredient;
	}

	public Float getPrix_ingredient() {
		return prix_ingredient;
	}

	public void setPrix_ingredient(Float prix_ingredient) {
		this.prix_ingredient = prix_ingredient;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
