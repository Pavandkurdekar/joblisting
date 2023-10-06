package com.Pavan.CrudProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JobData")
public class JobModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NoOfJobs")
	 private Long S_NO;
	
	
	private String profile; 
	 private String description;
	 private int exp;
	 private String tech1;
	 private String tech2;
	 private String tech3;
	 private String tech4;
	 private String tech5;
	
	 
	 public Long getS_NO() {
		return S_NO;
	}
	public void setS_NO(Long s_NO) {
		S_NO = s_NO;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getTech1() {
		return tech1;
	}
	public void setTech1(String tech1) {
		this.tech1 = tech1;
	}
	public String getTech2() {
		return tech2;
	}
	public void setTech2(String tech2) {
		this.tech2 = tech2;
	}
	public String getTech3() {
		return tech3;
	}
	public void setTech3(String tech3) {
		this.tech3 = tech3;
	}
	public String getTech4() {
		return tech4;
	}
	public void setTech4(String tech4) {
		this.tech4 = tech4;
	}
	public String getTech5() {
		return tech5;
	}
	public void setTech5(String tech5) {
		this.tech5 = tech5;
	}
	 
	 

}
