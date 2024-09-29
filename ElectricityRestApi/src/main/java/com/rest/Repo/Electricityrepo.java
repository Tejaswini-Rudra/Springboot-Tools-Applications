package com.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.rest.Entity.Electricity;
@Repository
public interface Electricityrepo extends JpaRepository<Electricity, Integer> {

	

}
