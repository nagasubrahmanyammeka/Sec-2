package com.klu.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.dto.StudentRequestDTO;
import com.klu.dto.StudentResponseDTO;
import com.klu.model.Student;
import com.klu.repo.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    // Create Student
    public StudentResponseDTO addStudent(StudentRequestDTO reqdto) {
        // 1. Convert DTO -> Entity
        Student entity = modelMapper.map(reqdto, Student.class);

        // 2. Assign Default Password
        entity.setPassword("klu123");

        // 3. Save entity and convert back to ResponseDTO
        return modelMapper.map(studentRepo.save(entity), StudentResponseDTO.class);
    }
}