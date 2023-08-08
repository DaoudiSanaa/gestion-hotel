package org.mql.hotel.models;

public class Admin {
	private String userName;
	private String pwd;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", pwd=" + pwd + "]";
	}
	

}
