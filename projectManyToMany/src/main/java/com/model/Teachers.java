package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teachers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String splSubject;
	private int phone;
	private String email;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Classes> classes;
	public Teachers() {
	}

	public Teachers(int id, String name, String splSubject, int phone, String email, List<Classes> classes) {
		this.id = id;
		this.name = name;
		this.splSubject = splSubject;
		this.phone = phone;
		this.email = email;
		this.classes = classes;
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

	public String getSplSubject() {
		return splSubject;
	}

	public void setSplSubject(String splSubject) {
		this.splSubject = splSubject;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + ", splSubject=" + splSubject + ", phone=" + phone + ", email="
				+ email + ", getId()=" + getId() + ", getName()=" + getName() + ", getSplSubject()=" + getSplSubject()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + "]";
	}
	
	

}
