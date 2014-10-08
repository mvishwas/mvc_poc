package com.mycom.chartpoc.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import com.mycom.chartpoc.entity.EmployeeSkill;

public interface EmployeeService {
	Collection<EmployeeSkill> getEmployeSkils() throws DataAccessException;
}
