package am.cs322.model.transaction;

import jakarta.annotation.Nonnull;

public record CreateTransactionRequest(@Nonnull Long userId) {
}