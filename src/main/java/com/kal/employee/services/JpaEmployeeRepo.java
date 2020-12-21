package com.kal.employee.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeRepo extends JpaRepository<Employee,Integer> {
}
