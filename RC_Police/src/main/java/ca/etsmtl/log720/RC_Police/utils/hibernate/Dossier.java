package ca.etsmtl.log720.RC_Police.utils.hibernate;

import javax.persistence.*;

@Entity
@Table(name="dossier")
public class Dossier {
	
	private int id;
	private String nom;
	private String preNom;
	private String noPermis;
	private String noPlaque;
	private int idNiVeau;

	@Id	
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "nom", unique = false, nullable = true)
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name = "prenom", unique = false, nullable = true)
	public String getPreNom() {
		return preNom;
	}
	public void setPreNom(String preNom) {
		this.preNom = preNom;
	}
	@Column(name = "noPermis", unique = true, nullable = false)
	public String getNoPermis() {
		return noPermis;
	}
	public void setNoPermis(String noPermis) {
		this.noPermis = noPermis;
	}
	@Column(name = "noPlaque", unique = true, nullable = false)
	public String getNoPlaque() {
		return noPlaque;
	}
	public void setNoPlaque(String noPlaque) {
		this.noPlaque = noPlaque;
	}
	@Column(name = "idNiveau", unique = false, nullable = true)
	public int getIdNiVeau() {
		return idNiVeau;
	}
	public void setIdNiVeau(int idNiVeau) {
		this.idNiVeau = idNiVeau;
	}

}
