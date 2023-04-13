package com.bssm.leejunyoung.hellospring.repository;

import com.bssm.leejunyoung.hellospring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryStudentRepository {
    private static Map<Long, Student> store = new HashMap<>();

    public Student save(Student student) {
        Student saveStudent = store.put(student.getId(), student);
        return saveStudent;
    }
}
