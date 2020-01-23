package com.backMan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.backMan.entity.Employee;
import com.backMan.entity.Users;
@RepositoryRestResource
public interface EmployeeRepository extends  JpaRepository<Employee, Long> {

}
