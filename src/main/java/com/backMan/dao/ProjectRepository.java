package com.backMan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.backMan.entity.Project;
import com.backMan.entity.Users;
@RepositoryRestResource
public interface ProjectRepository extends  JpaRepository<Project, Long> {

}
