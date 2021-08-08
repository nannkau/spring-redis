package vn.amit.springredis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.amit.springredis.entity.Student;
import vn.amit.springredis.model.request.AddStudentRequest;
import vn.amit.springredis.model.request.UpdateStudentRequest;
import vn.amit.springredis.model.response.BaseResponse;
import vn.amit.springredis.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping()
    public ResponseEntity<BaseResponse<List<Student>>> get() {
        return ResponseEntity.ok().body(new BaseResponse<>(studentService.findAll()));
    }
    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<Student>> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(new BaseResponse<>(studentService.find(id)));
    }
    @PostMapping()
    public ResponseEntity<BaseResponse<Student>> create(@RequestBody AddStudentRequest request) {
        return ResponseEntity.ok().body(new BaseResponse<>(studentService.save(request)));
    }

    @PutMapping()
    public ResponseEntity<BaseResponse<Student>> update(@RequestBody UpdateStudentRequest item) {
        return ResponseEntity.ok().body(new BaseResponse<>(studentService.update(item)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponse<String>> delete(@PathVariable("id") String id) {
        studentService.delete(id);
        return ResponseEntity.ok().body(new BaseResponse<>());
    }
}

