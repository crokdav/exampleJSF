package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Produit {
@Id
@GeneratedValue
private int id;
@Column(nullable = false, unique=true)
private String nom;
private String descr;
private double prix;
@JoinColumn(name = "idMarque")
@ManyToOne
private Marque marque;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit( String nom, String descr, double prix) {
	super();
	this.nom = nom;
	this.descr = descr;
	this.prix = prix;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescr() {
	return descr;
}
public void setDescr(String descr) {
	this.descr = descr;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

public Marque getMarque() {
	return marque;
}
public void setMarque(Marque marque) {
	this.marque = marque;
}
@Override
public String toString() {
	return "Produit [id=" + id + ", nom=" + nom + ", desc=" + descr + ", prix=" + prix + "]";
}



}
