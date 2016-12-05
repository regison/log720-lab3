package ca.etsmtl.log720.RC_Police.utils.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
	
	private int id;		
	private String username;	
	private String password;
	private String rolename;
	
	
	@Id	
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "username", unique = false, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", unique = false, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "rolnaeme", unique = false, nullable = false)
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	 @Override
	    public String toString() {
	        return "Utilisateur [id=" + id + ", Nom d'utilisateur=" + username + ", Type="
	             + rolename + "]";
	    }
	

}
