package Entites.concretes;

import Entites.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String sorName;
	private String eMail;
	private String userName;
	private String password;
	public User() {
		
	}
	public User(int id, String name, String sorName, String eMail, String password,String userName) {
		super();
		this.id = id;
		this.name = name;
		this.sorName = sorName;
		this.eMail = eMail;
		this.password = password;
		this.userName=userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSorName() {
		return sorName;
	}
	public void setSorName(String sorName) {
		this.sorName = sorName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
