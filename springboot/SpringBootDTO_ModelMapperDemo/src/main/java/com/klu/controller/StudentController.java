package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.klu.dto.StudentRequestDTO;
import com.klu.dto.StudentResponseDTO;
import com.klu.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/stud")
@CrossOrigin("*")
public class StudentController {
  @Autowired
  private StudentService studentService;
  
  @PostMapping("/addStudent")
  public ResponseEntity<StudentResponseDTO> addStudent(@Valid @RequestBody StudentRequestDTO dto){
    return new ResponseEntity<>(studentService.addStudent(dto),HttpStatus.CREATED);
  }
}
