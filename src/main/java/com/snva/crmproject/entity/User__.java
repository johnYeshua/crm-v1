package com.snva.crmproject.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class User__{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String username; 
	private String role;
	
	@Transient
	private String firstName;
	@Transient
	private String lastName;

	


	public User__(long userId, String username, String role, String firstName, String lastName
			) {
		this.userId = userId;
		this.username = username;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public String getRole() {
		return role;
	}
	
	
	public void setRole(String role) {
		this.role=role;		
	}
	
	
   public Collection<? extends GrantedAuthority> getAuthorities() {
       List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();

       list.add(new SimpleGrantedAuthority(role));

       return list;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", role=" + role
				+", firstName=" + firstName + ", lastName=" + lastName +"]";
	}
	
	
}
