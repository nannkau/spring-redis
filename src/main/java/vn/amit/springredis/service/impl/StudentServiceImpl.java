package vn.amit.springredis.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.amit.springredis.entity.Student;
import vn.amit.springredis.model.request.AddStudentRequest;
import vn.amit.springredis.model.request.UpdateStudentRequest;
import vn.amit.springredis.repository.StudentRepository;
import vn.amit.springredis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student save(AddStudentRequest request) {
        Student student = new Student();
        student.setFullName(request.getFullName());
        student.setStudentCode(request.getStudentCode());
        return repository.save(student);
    }

    @Override
    public Student find(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();

        repository.findAll().forEach(students::add);
        return students;
    }

    @Override
    public Student update(UpdateStudentRequest request) {
        Student student = repository.findById(request.getId()).get();
        student.setFullName(request.getFullName());
        student.setStudentCode(request.getStudentCode());
        return repository.save(student);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }

}
