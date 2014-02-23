package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the todolist database table.
 * 
 */
@Entity
@NamedQuery(name="Todolist.findAll", query="SELECT t FROM Todolist t")
public class Todolist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int listID;

	private String item;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="todolist")
	private List<User> users;

	public Todolist() {
	}

	public int getListID() {
		return this.listID;
	}

	public void setListID(int listID) {
		this.listID = listID;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setTodolist(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setTodolist(null);

		return user;
	}

}