package com.Banking.BankingProject.entity;

import org.springframework.data.jpa.repository.JpaRepository;

// This interface is a repository for performing CRUD operations on the Account entity
// It extends JpaRepository, which provides many built-in methods like save, findById, findAll, delete, etc

public interface AccountRepository extends JpaRepository<Account,Long> {

// No need to write any code here, because JpaRepository already provides everything needed
// for basic database operations on the Account entity
}
