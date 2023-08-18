package com.crudApp.entities;

import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	String kodId;
	String name;
	String batch;
	
	public Student() {
		super();
	}

	public Student(String kodId, String name, String batch) {
		super();
		this.kodId = kodId;
		this.name = name;
		this.batch = batch;
	}

	public String getKodId() {
		return kodId;
	}

	public void setKodId(String kodId) {
		this.kodId = kodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", batch=" + batch + "]";
	}
}
