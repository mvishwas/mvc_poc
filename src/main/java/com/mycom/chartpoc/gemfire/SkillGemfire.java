package com.mycom.chartpoc.gemfire;

import java.io.Serializable;

/**
 * The persistent class for the skill database table.
 * 
 */

public class SkillGemfire implements Serializable {
	private static final long serialVersionUID = 1L;

	private String skillId;

	private String skillName;

	public SkillGemfire() {
	}

	public String getSkillId() {
		return this.skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
}