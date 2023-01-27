package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import com.example.account.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//Account Table 에 접속하기 위한 인터페이스 만들기
@Repository
public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {

    Optional<Transaction> findByTransactionId(String transactionId);

}
