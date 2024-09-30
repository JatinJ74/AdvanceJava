package com.myProject.springbootcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.myProject.springbootcrud.entities.EmployeeT;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeT, Integer>{

	
}
