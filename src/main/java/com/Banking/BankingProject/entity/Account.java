package com.Banking.BankingProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data   // Lombok annotation that automatically generates getters, setters, toString, equals, and hashCode methods
@Entity // Marks this class as a JPA entity meaning it maps to a table in the database
public class Account {


    @Id // Specifies that the 'id' field is the primary key of the entity
    // This tells the database to automatically generate the value for 'id' using an auto-increment strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Unique identifier for each account in the database.

    private String accountHolderName;  // The name of the person who owns the account

    private double balance;  // The current balance of the account




}
