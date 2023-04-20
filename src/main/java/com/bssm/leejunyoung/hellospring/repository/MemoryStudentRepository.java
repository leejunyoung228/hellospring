package com.bssm.leejunyoung.hellospring.repository;

import com.bssm.leejunyoung.hellospring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryStudentRepository {
    private static Map<Long, Student> store = new HashMap<>();

    public Student save(Student student) {
        return store.put(student.getId(), student);
    }

    public Student findById(Long id) {
        return store.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(store.values());
    }
}
