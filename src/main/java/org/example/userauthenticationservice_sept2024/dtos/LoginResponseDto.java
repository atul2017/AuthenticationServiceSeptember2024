package org.example.userauthenticationservice_sept2024.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponseDto {

    private String token;
    private boolean success;
}
