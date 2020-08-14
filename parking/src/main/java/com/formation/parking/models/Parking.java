package com.formation.parking.models;

public class Parking {
	
	private String nom;
	private int nbPlacesDispo;
	private int nbPlacesTotal;
	private String status;
	private String heureMaj;

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbPlacesDispo() {
		return nbPlacesDispo;
	}
	public void setNbPlacesDispo(int nbPlacesDispo) {
		this.nbPlacesDispo = nbPlacesDispo;
	}
	public int getNbPlacesTotal() {
		return nbPlacesTotal;
	}
	public void setNbPlacesTotal(int nbPlacesTotal) {
		this.nbPlacesTotal = nbPlacesTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHeureMaj() {
		return heureMaj;
	}
	public void setHeureMaj(String heureMaj) {
		this.heureMaj = heureMaj;
	}

}
