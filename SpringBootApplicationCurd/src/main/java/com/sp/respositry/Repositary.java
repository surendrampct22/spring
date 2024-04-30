package com.sp.respositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.model.Employee;


@Repository
public interface Repositary extends JpaRepository<Employee, Long>{

}
