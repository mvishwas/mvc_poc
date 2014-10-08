package com.mycom.chartpoc.repository.jpa.springdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycom.chartpoc.entity.EmployeeSkill;

@Repository
public interface EmployeeDataRepository extends
		CrudRepository<EmployeeSkill, String> {

}
