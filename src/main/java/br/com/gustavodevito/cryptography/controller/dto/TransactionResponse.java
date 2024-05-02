package br.com.gustavodevito.cryptography.controller.dto;

import br.com.gustavodevito.cryptography.entity.TransactionEntity;

public record TransactionResponse(Long id,
        String userDocument,
        String creditCardToken,
        Long value) {

    public static TransactionResponse fromEntity(TransactionEntity entity) {
        return new TransactionResponse(
                entity.getTransactionId(),
                entity.getRawUserDocument(),
                entity.getRawCreditCardToken(),
                entity.getTransactionValue());
    }
}