package com.mycom.chartpoc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mycom.chartpoc.entity.EmployeeSkill;
import com.mycom.chartpoc.repository.jpa.springdatajpa.EmployeeDataRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDataRepository employeeDataRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeDataRepository datarepository) {
		this.employeeDataRepository = datarepository;
	}

	@Override
	public Collection<EmployeeSkill> getEmployeSkils()
			throws DataAccessException {
		@SuppressWarnings("unchecked")
		Iterable<EmployeeSkill> itterator = employeeDataRepository.findAll();
		ArrayList<EmployeeSkill> skills = new ArrayList<EmployeeSkill>();
		Iterator<EmployeeSkill> iterator = itterator.iterator();
		while (iterator.hasNext()) {
			skills.add(iterator.next());
		}
		return skills;
	}
}
