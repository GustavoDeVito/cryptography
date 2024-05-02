package br.com.gustavodevito.cryptography.repository;

import br.com.gustavodevito.cryptography.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<TransactionEntity, Long> {
}
