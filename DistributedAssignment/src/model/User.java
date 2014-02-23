package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserPK id;

	private String password;

	//bi-directional many-to-one association to Todolist
	@ManyToOne
	@JoinColumn(name="listID")
	private Todolist todolist = new Todolist();

	public User() {
	}

	public UserPK getId() {
		return this.id;
	}

	public void setId(UserPK id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Todolist getTodolist() {
		return this.todolist;
	}

	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;
	}

}