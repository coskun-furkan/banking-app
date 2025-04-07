package com.Banking.BankingProject.service;

import com.Banking.BankingProject.entity.Account;
import com.Banking.BankingProject.entity.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired // Automatically injects an instance of AccountRepository
    private AccountRepository accountRepository;

    // Returns a list of all accounts from the database
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Saves a new account to the database and returns the saved object
    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    // Retrieves an account by its ID. Returns an Optional in case it doesn’t exist.
    public Optional<Account> getAccount(Long id) {
        return accountRepository.findById(id);
    }

    // Adds the given amount to the account's balance and saves the updated account
    public Account deposit(Long id, double amount){
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        return accountRepository.save(account);
    }

    // Subtracts the given amount from the account's balance if funds are sufficient
    public Account withdraw(Long id,double amount){
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        if(account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
        return accountRepository.save(account);
    }

}
