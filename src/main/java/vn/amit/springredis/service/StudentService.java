package vn.amit.springredis.service;

import java.util.List;

import vn.amit.springredis.entity.Student;
import vn.amit.springredis.model.request.AddStudentRequest;
import vn.amit.springredis.model.request.UpdateStudentRequest;

public interface StudentService {
    Student save(AddStudentRequest request);
	Student find(String id);
	List<Student> findAll();
	Student update(UpdateStudentRequest request);
	void delete(String id);
}
