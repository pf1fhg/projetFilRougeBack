package com.myIGCoach.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "users")
public class User {
	// id of user
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users")
	@SequenceGenerator(name = "users", sequenceName = "user_seq", allocationSize = 1)
	private Long id;
	// firstName of user
	@Column(name = "firstName")
	private String firstName;
	// Name of user
	@Column(name = "lastName")
	private String lastName;
	// email of user
	@Column(name = "email")
	private String email;
	// this is the relation Object between user who is owner of ingredient
	@OneToMany(mappedBy = "owner")
	@JsonManagedReference
	private List<Ingredient> ingredients = new ArrayList<>();
	
	/************************
	 * GETTERS AND SETTERS
	 ***********************/
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
}
