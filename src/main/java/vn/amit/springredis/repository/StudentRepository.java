package vn.amit.springredis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.amit.springredis.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
    
}
