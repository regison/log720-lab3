package ca.etsmtl.log720.RC_Police.utils.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infraction")
public class Infraction {

	private int id;
	private String description;
	private int idNiveau;
	
	@Id	
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "description", unique = false, nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "idniveau", unique = false, nullable = false)
	public int getIdNiveau() {
		return idNiveau;
	}
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}
	
	
}
