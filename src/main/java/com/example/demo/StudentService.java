package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    void saveStudent(Student student);
}
