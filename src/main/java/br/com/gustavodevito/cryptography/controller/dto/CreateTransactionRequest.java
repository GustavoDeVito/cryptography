package br.com.gustavodevito.cryptography.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CreateTransactionRequest(@NotNull String userDocument,
        @NotNull String creditCardToken,
        @NotNull @Min(value = 0) Long value) {
}
