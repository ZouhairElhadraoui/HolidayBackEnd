package com.backMan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.backMan.entity.EmployeeHasProject;
import com.backMan.entity.Users;
@RepositoryRestResource
public interface EmplyeeHasProjectRepository extends  JpaRepository<EmployeeHasProject, Long> {

}
