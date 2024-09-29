package com.web.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Product;
@Repository
public interface Productrepo extends JpaRepository<Product, Integer> {

}
