package com.hailong.identity_service.dto.request;

import com.hailong.identity_service.validator.DobConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateRequest {
    private String password;
    private String firstName;
    private String lastName;
    @DobConstraint(min = 18, message = "INVALID_DOB")
    private LocalDate dob;
    private List<String> roles;

}
