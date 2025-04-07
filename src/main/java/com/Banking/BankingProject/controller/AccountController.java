package com.Banking.BankingProject.controller;

import com.Banking.BankingProject.entity.Account;
import com.Banking.BankingProject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired // Automatically injects the AccountService dependency
    private AccountService accountService;

    @GetMapping  // Handles HTTP GET requests to "/api/accounts"
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }


    @PostMapping // Handles HTTP POST requests to "/api/accounts"
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @GetMapping("/{id}") // Handles HTTP GET requests to "/api/accounts/{id}"
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @PostMapping("/{id}/deposit")  // Handles HTTP POST requests to "/api/accounts/{id}/deposit"
    public Account deposit(@PathVariable Long id, @RequestBody Map<String,Double> request){
        Double amount = request.get("amount");
        return accountService.deposit(id,amount);
    }

    @PostMapping("/{id}/withdraw") // Handles HTTP POST requests to "/api/accounts/{id}/withdraw"
    public Account withdraw(@PathVariable Long id, @RequestBody Map<String,Double> request){
        Double amount = request.get("amount");
        return accountService.withdraw(id,amount);
    }

}
