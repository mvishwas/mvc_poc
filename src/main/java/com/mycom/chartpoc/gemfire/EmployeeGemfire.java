package com.mycom.chartpoc.gemfire;

import java.io.Serializable;

/**
 * The persistent class for the employee database table.
 * 
 */
public class EmployeeGemfire implements Serializable {
	private static final long serialVersionUID = 1L;

	private String employeeId;

	private String employeeCode;

	private String employeeName;

	public EmployeeGemfire() {
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}