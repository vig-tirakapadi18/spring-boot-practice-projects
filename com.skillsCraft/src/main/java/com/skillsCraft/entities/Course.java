package com.skillsCraft.entities;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Course {
	@Id
	int cId;
	String cName;
	int cPrice;
	
	@OneToMany
	List<Lesson> lList;
	
	@ManyToMany
	List<Users> uList;

	public Course() {
		super();
	}

	public Course(int cId, String cName, int cPrice, List<Lesson> lList, List<Users> uList) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPrice = cPrice;
		this.lList = lList;
		this.uList = uList;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcPrice() {
		return cPrice;
	}

	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}

	public List<Lesson> getlList() {
		return lList;
	}

	public void setlList(List<Lesson> lList) {
		this.lList = lList;
	}

	public List<Users> getuList() {
		return uList;
	}

	public void setuList(List<Users> uList) {
		this.uList = uList;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cPrice=" + cPrice + ", lList=" + (lList == null ? "null" : lList.size()) + ", uList="
				+ (uList == null ? "null" : uList.size()) + "]";
	}
}
