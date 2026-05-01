package com.tentBazaar.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tentBazaar.customer.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

}
