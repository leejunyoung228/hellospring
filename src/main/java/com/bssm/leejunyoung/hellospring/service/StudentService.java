package com.bssm.leejunyoung.hellospring.service;

import com.bssm.leejunyoung.hellospring.domain.Student;
import com.bssm.leejunyoung.hellospring.repository.MemoryStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final MemoryStudentRepository repository;

    @Autowired
    public StudentService(MemoryStudentRepository repository){
        this.repository = repository;
    }

    public Long edit(Student student) {
        validateDuplicateStudent(student);
        repository.save(student);
        return student.getId();
    }

    private void validateDuplicateStudent(Student student) {
        if (repository.findById(student.getId()) != null){
            throw new IllegalStateException("이미 등록된 학생입니다.");
        }
    }

    public List<Student> findStudents() {
        return repository.findAll();
    }
}
