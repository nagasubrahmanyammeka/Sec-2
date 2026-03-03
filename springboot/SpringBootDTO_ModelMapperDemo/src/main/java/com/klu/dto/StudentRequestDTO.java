package com.klu.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {
	@NotEmpty(message = "Student Name is Required")
	private String name;
	@Email(message  ="Email Must be in the format")
	private String email;
	@NotEmpty(message = "Branch Required/ Brach must not be NUll")
	private String branch;
	@NotEmpty(message = "Course Required/Course must not be NUll")
	private String course;
	@Positive(message = "Fees Must be Positive number")
	private Double fees;

}
