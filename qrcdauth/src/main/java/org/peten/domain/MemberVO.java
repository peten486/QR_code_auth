package org.peten.domain;

public class MemberVO {
	private String name;
	private String email;
	private String phone;
	private String password;
	private String uuid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public String toString(){
		return "MemberVO [name=" + name + ", email=" + email + ", phone="+phone+", password="+password+", uuid="+uuid+"]";
	}
}
