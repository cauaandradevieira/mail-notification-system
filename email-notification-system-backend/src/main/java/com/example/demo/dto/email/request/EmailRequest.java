package com.example.demo.dto.email.request;

import jakarta.validation.constraints.NotBlank;

public record EmailRequest(@NotBlank(message = "TO VAZIO") String to,
                           @NotBlank(message = "TITLE VAZIO") String title,
                           @NotBlank(message = "SUBJECT VAZIO") String subject,
                           @NotBlank(message = "BODY VAZIO") String body) {
}
