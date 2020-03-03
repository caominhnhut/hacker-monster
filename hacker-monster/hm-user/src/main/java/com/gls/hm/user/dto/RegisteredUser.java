package com.gls.hm.user.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

@FieldMatch(first = "password", second = "confirmedPassword", message = "The confirmed password fields must match")
public class RegisteredUser {

    private Long id;

    @NotBlank
    @Email(message = "The email is not correct format")
    private String email;

    @NotBlank(message = "The email should not be empty")
    @Size(min=8,message = "The password should not be empty and have at least 8 letters")
    private String password;

    @NotBlank
    private String confirmedPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

}
