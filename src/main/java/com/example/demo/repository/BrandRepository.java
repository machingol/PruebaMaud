package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cadena;


@Repository
//@Service
public interface BrandRepository extends JpaRepository<Cadena, Long> {
	
	
}
