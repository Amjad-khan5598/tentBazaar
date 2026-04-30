package com.tentBazaar.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class CustomerEntity {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
  private Long id;
	
  @NotBlank
  private String name;
  
  private int age;
  
  @Email
  private String email;
  
  @JsonIgnore
  @Column(nullable = false)
  private String password;
  
  
}
