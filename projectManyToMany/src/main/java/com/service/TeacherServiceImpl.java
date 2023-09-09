package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TeacherRepository;
import com.model.Teachers;
@Service
public class TeacherServiceImpl implements TeacherServiceInt {

	@Autowired
	TeacherRepository teacherRepo;
	public Teachers addTeacher(Teachers teacher) {
		
		return teacherRepo.save(teacher);
	}

}
