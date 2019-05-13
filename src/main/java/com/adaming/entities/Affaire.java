package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAffaire;
	private String referenceAffaire;
	private String titreAffaire;
	private String descriptionAffaire;
	
	@OneToMany(mappedBy="affaire")
	private Set<Tache> taches=new HashSet<Tache>();

	public Affaire() {
		super();
	}

	public Affaire(String referenceAffaire, String titreAffaire, String descriptionAffaire, Set<Tache> taches) {
		super();
		this.referenceAffaire = referenceAffaire;
		this.titreAffaire = titreAffaire;
		this.descriptionAffaire = descriptionAffaire;
		this.taches = taches;
	}

	public Affaire(String referenceAffaire, String titreAffaire, String descriptionAffaire) {
		super();
		this.referenceAffaire = referenceAffaire;
		this.titreAffaire = titreAffaire;
		this.descriptionAffaire = descriptionAffaire;
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getReferenceAffaire() {
		return referenceAffaire;
	}

	public void setReferenceAffaire(String referenceAffaire) {
		this.referenceAffaire = referenceAffaire;
	}

	public String getTitreAffaire() {
		return titreAffaire;
	}

	public void setTitreAffaire(String titreAffaire) {
		this.titreAffaire = titreAffaire;
	}

	public String getDescriptionAffaire() {
		return descriptionAffaire;
	}

	public void setDescriptionAffaire(String descriptionAffaire) {
		this.descriptionAffaire = descriptionAffaire;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", referenceAffaire=" + referenceAffaire + ", titreAffaire="
				+ titreAffaire + ", descriptionAffaire=" + descriptionAffaire + "]";
	}
		
}
