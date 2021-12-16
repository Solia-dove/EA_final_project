package com.example.ea_final_project.payload.request;

import lombok.Data;
import javax.validation.constraints.*;

import java.util.Set;

@Data
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String firstname;
    private String lastname;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> roles;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

//    public Set<String> getRoles() {
//        return this.roles;
//    }
}