package com.example.swcompetitionproject.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginDto {
    @NotBlank(message = "아이디를 입력해 주세요")
    private String id;

    @NotBlank(message = "비밀번호를 입력해 주세요")
    private String passwrd;
}
