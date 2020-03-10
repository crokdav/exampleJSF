package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Marque {
	@Id
	@GeneratedValue
	private int idMarque;
	private String nomMarque;
	@Temporal(TemporalType.DATE)
	private Date datecreation;
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marque( String nomMarque, Date datecreation) {
		super();
		this.nomMarque = nomMarque;
		this.datecreation = datecreation;
	}
	public int getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}
	public String getNomMarque() {
		return nomMarque;
	}
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	@Override
	public String toString() {
		return "Marque [id=" + idMarque + ", nomMarque=" + nomMarque + ", datecreation=" + datecreation + "]";
	}
	
	
	
}
