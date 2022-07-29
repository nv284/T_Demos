package com.org.demo.HibDemo2;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "student1")
public class Student {

	@Id
    @GeneratedValue
    @Column(name = "student_id")
    private long id;
 
    @Column(name = "first_name")
    private String firstName;
 
    @Column(name = "last_name")
    private String lastName;
 
    @Column(name = "email")
    private String email;
 
    @Column(name = "phone")
    private String phone;
 
    @OneToMany(mappedBy = "student1", cascade = CascadeType.ALL)
    private Set marksDetails;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Set getMarksDetails() {
		return marksDetails;
	}

	public void setMarksDetails(Set marksDetails) {
		this.marksDetails = marksDetails;
	}
    
}
