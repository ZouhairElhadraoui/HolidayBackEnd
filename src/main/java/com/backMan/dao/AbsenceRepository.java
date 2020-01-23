package com.backMan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.backMan.entity.Absence;
import com.backMan.entity.Users;
@RepositoryRestResource
public interface AbsenceRepository extends  JpaRepository<Absence, Long> {

}
