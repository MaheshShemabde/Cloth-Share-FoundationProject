package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Teachers;

public interface TeacherRepository extends JpaRepository<Teachers , Integer> {

}
