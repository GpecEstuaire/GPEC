package com.cci.gpec.commons;

import java.io.File;
import java.util.Date;

public class EvenementBean implements Comparable<EvenementBean> {

	private int id;
	private Integer idSalarie;

	private String commentaire;
	private String nature;
	private String decision;
	private Date dateEvenement;
	private String interlocuteur;
	private String justificatif;
	private String service;

	private String cutNature;
	private String hasDecision;

	private String nom;
	private String prenom;
	private String nomEntreprise;
	private Integer idEntreprise;

	private File justif;

	private boolean fileError;

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public File getJustif() {
		if (justificatif != null) {
			return new File(justificatif);
		} else {
			return null;
		}
	}

	public void setJustif(File justif) {
		this.justif = justif;
	}

	public String getJustificatif() {
		return justificatif;
	}

	public void setJustificatif(String justificatif) {
		this.justificatif = justificatif;
	}

	public boolean isFileError() {
		if (getJustif() != null) {
			if (getJustif().exists() && getJustif().isFile()
					&& getJustif().canRead()) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public void setFileError(boolean fileError) {
		this.fileError = fileError;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public Date getDateEvenement() {
		return dateEvenement;
	}

	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	public Integer getIdSalarie() {
		return idSalarie;
	}

	public void setIdSalarie(Integer idSalarie) {
		this.idSalarie = idSalarie;
	}

	public String getCutNature() {
		if (nature.length() > 30) {
			return nature.substring(0, 30);
		} else {
			return nature;
		}
	}

	public void setCutNature(String cutNature) {
		this.cutNature = cutNature;
	}

	public String getHasDecision() {
		if (decision != null && decision.length() > 0) {
			return "oui";
		} else {
			return "non";
		}
	}

	public void setHasDecision(String hasDecision) {
		this.hasDecision = hasDecision;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getInterlocuteur() {
		return interlocuteur;
	}

	public void setInterlocuteur(String interlocuteur) {
		this.interlocuteur = interlocuteur;
	}

	public int compareTo(EvenementBean o) {
		if (dateEvenement.equals(o.dateEvenement)) {
			return id < o.id ? -1 : 1;
		} else {
			return dateEvenement.compareTo(o.dateEvenement);
		}
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
