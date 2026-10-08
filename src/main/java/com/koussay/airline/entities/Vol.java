package com.koussay.airline.entities;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

import jakarta.persistence.Entity;
@Entity
public class Vol {

    @Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", numero=" + numero + ", origine=" + origine + ", destination=" + destination
				+ ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + "]";
	}
	public Vol(String numero, String origine, String destination, Date dateDepart, Date dateArrivee) {
		super();
		this.numero = numero;
		this.origine = origine;
		this.destination = destination;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
	}
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdVol() {
		return idVol;
	}
	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Compagnie getCompagnie() {
	    return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
	    this.compagnie = compagnie;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVol;
    private String numero;
    private String origine;
    private String destination;
    private Date dateDepart;
    private Date dateArrivee;
    @ManyToOne
    @JoinColumn(name = "id_compagnie")
    private Compagnie compagnie;

}