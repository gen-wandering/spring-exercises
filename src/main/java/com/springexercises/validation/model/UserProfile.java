package com.springexercises.validation.model;

import com.springexercises.validation.validator.ComplexPassword;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$")
    private String username;

    @NotBlank
    @Size(min = 8)
    @ComplexPassword
    private String password;

    @Email
    private String email;

    @Min(1)
    private int age;

    private LocalDate dateOfBirth;
}