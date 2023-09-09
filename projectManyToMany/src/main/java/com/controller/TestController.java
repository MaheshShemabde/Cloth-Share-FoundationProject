package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Teachers;
import com.service.TeacherServiceImpl;

@RestController
@RequestMapping("/t")
public class TestController {
	@Autowired
	TeacherServiceImpl teacherService;
	@PostMapping("/save")
	public Teachers saveTeacher(@RequestBody Teachers teacher) {
		return teacherService.addTeacher(teacher);
	} 

}
