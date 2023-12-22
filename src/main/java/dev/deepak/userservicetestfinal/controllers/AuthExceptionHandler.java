package dev.deepak.userservicetestfinal.controllers;

import dev.deepak.userservicetestfinal.dtos.LoginResponseDto;
import dev.deepak.userservicetestfinal.exceptions.LoginFailedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class AuthExceptionHandler {
    @ExceptionHandler(LoginFailedException.class)
    public ResponseEntity<LoginResponseDto> handleLoginError(LoginFailedException e) {
        log.error("Login failed!");
        LoginResponseDto loginResponseDto = new LoginResponseDto("Failed", e.getMessage());
        return new ResponseEntity<>(loginResponseDto, HttpStatus.UNAUTHORIZED);
    }
}
