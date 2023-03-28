package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;

//    @Autowired
//    private ModelMapper modelMapper;

    @PostMapping("/save")
    public void saveStudent(Student student) {
//        ModelMapper modelMapper = new ModelMapper();
//        StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
        studentService.saveStudent(student);

    }
}
