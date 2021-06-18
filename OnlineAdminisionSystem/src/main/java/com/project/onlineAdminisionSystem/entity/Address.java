package com.project.onlineAdminisionSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int addressId;
	@NotNull(message = "city cannot be null")
	private String city;
	@NotNull(message = "district cannot be null")
	private String district;
	@NotNull(message = "state cannot be null")
	private  String state;
	@NotNull(message = "country cannot be null")
	private String country;
	@NotNull(message = "zipcode cannot be null")
	private String zipcode;
	

	
	
	

	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public Address(int addressId, String city, String district, String state, String country, String zipcode
			) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	
	}
	public Address(String city, String state, String country, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	public Address() {
		super();
	}
	
	
	
}
