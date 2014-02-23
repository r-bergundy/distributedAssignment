package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user database table.
 * 
 */
@Embeddable
public class UserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String username;

	@Column(insertable=false, updatable=false)
	private int listID;

	public UserPK() {
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getListID() {
		return this.listID;
	}
	public void setListID(int listID) {
		this.listID = listID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPK)) {
			return false;
		}
		UserPK castOther = (UserPK)other;
		return 
			this.username.equals(castOther.username)
			&& (this.listID == castOther.listID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.username.hashCode();
		hash = hash * prime + this.listID;
		
		return hash;
	}
}