package com.backMan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.backMan.entity.AbsenceType;
import com.backMan.entity.Users;
@RepositoryRestResource
public interface AbsenceTypeRepository extends  JpaRepository<AbsenceType, Long> {

}
