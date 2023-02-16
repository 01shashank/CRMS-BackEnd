package com.hex.crms.model;

//CHECKSTYLE:OFF
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Entity
@Table(name = "users")
@Scope("session")
@Component
public class User implements UserDetails {

	public static enum Role {
		USER
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
 
private String email;  
@Column(name="passwordhash")
private String password;
@JsonProperty("phoneNumber")
private long phonenumber;
private String username;
@JsonProperty("empid")
private long empID;
private String empAddress;
private Integer userType; 
private String firstname; 
private String lastname;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}



	public long getEmpID() {
		return this.empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", email='" + getEmail() + "'" +
			", passwordHash='" + getPassword() + "'" +
			", phonenumber='" + getPhonenumber() + "'" +
			", userName='" + getUsername() + "'" +
			", empID='" + getEmpID() + "'" +
			", empAddress='" + getEmpAddress() + "'" +
			", userType='" + getUserType() + "'" +
			", firstname='" + getFirstname() + "'" +
			", lastname='" + getLastname() + "'" +
			"}";
	}
	

	public User() {

	}



	@JsonIgnore
	@Override
	public boolean isEnabled() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("User"));
		return authorities;
	}








}
