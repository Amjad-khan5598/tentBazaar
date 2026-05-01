package com.tentBazaar.customer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class CustomerEntity {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
  private Long id;
	
  @NotBlank
  private String name;
  
  
  private int age;
  
  @Email
  @Column(unique=true)
  private String email;
  
  @JsonIgnore
  @Column(nullable = false)
  private String password;
  
  @Column(unique=true)
  private String phone;
  
}
