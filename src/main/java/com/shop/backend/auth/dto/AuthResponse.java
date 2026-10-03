package com.shop.backend.auth.dto;

public record AuthResponse(
        String accessToken,
        String fullName,
        String email
) {}