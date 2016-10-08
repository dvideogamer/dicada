package com.derek.controller;

import com.derek.model.OneTimeExpense;
import com.derek.model.RecurringExpense;
import com.derek.repository.OneTimeExpenseRepository;
import com.derek.repository.RecurringExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class ExpenseController {

    @Autowired
    OneTimeExpenseRepository oneTimeExpenseRepository;

    @Autowired
    RecurringExpenseRepository recurringExpenseRepository;

    @RequestMapping("/oneTimeExpenses")
    public Iterable<OneTimeExpense> oneTimeExpenses() {
        return oneTimeExpenseRepository.findAll();
    }

    @RequestMapping("/recurringExpenses")
    public Iterable<RecurringExpense> recurringExpenses() {
        return recurringExpenseRepository.findAll();
    }
}