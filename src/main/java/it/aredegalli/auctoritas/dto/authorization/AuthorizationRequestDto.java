package it.aredegalli.auctoritas.dto.authorization;

import jakarta.validation.constraints.NotBlank;

public record AuthorizationRequestDto(
        @NotBlank String applicationName,
        @NotBlank String authenticatorName
) {
}
