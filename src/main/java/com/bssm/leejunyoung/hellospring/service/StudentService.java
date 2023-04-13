package com.bssm.leejunyoung.hellospring.service;

import com.bssm.leejunyoung.hellospring.domain.Student;
import com.bssm.leejunyoung.hellospring.repository.MemoryStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private MemoryStudentRepository repository;
    public Long edit(Student student) {
        Student save = repository.save(student);
        System.out.println(save.getId());
        return save.getId();
    }
}
