package com.jpa.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

