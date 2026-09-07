package com.example.bank_core_api.repository;

import com.example.bank_core_api.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
