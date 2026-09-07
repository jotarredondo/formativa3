package com.example.atm_bff.controller;

import com.example.atm_bff.client.AccountClient;
import com.example.atm_bff.dto.AtmAccountResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/atm/accounts")
public class AtmAccountController {

    private final AccountClient accountClient;

    public AtmAccountController(AccountClient accountClient) {
        this.accountClient = accountClient;
    }

    @GetMapping
    public List<AtmAccountResponse> getAccounts() {
        return accountClient.getAccounts()
                .stream()
                .map(account -> new AtmAccountResponse(
                        account.getAccountId(),
                        account.getBalance()
                ))
                .toList();
    }
}
