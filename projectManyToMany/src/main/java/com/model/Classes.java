package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;



@Entity
public class Classes {
	@Id
	private int coursecode;
	private String courseName;
	
	private int dayOfWeek;
	private int timeStart;
	private int timeEnd;
	
	@ManyToMany( fetch=FetchType.LAZY)
	@JoinColumn(name="id", nullable=false)
	private List<Teachers> teacher;
	
	public Classes() {
	}
	
	public Classes(String courseName, int coursecode, int dayOfWeek, int timeStart, int timeEnd,
			List<Teachers> teacher) {
		this.courseName = courseName;
		this.coursecode = coursecode;
		this.dayOfWeek = dayOfWeek;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.teacher = teacher;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(int coursecode) {
		this.coursecode = coursecode;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}
	public int getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(int timeEnd) {
		this.timeEnd = timeEnd;
	}
	
	
	public List<Teachers> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teachers> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [courseName=" + courseName + ", coursecode=" + coursecode + ", dayOfWeek=" + dayOfWeek
				+ ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", getCourseName()=" + getCourseName()
				+ ", getCoursecode()=" + getCoursecode() + ", getDayOfWeek()=" + getDayOfWeek() + ", getTimeStart()="
				+ getTimeStart() + ", getTimeEnd()=" + getTimeEnd() + "]";
	}
	
}
