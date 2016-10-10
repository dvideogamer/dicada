package com.derek.controller;

import com.derek.model.OneTimeExpense;
import com.derek.model.RecurringExpense;
import com.derek.repository.OneTimeExpenseRepository;
import com.derek.repository.RecurringExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class ExpenseController {

    @Autowired
    OneTimeExpenseRepository oneTimeExpenseRepository;

    @Autowired
    RecurringExpenseRepository recurringExpenseRepository;

    @RequestMapping("/oneTimeExpense")
    public Iterable<OneTimeExpense> oneTimeExpenses() {
        return oneTimeExpenseRepository.findAll();
    }

    @RequestMapping("/recurringExpense")
    public Iterable<RecurringExpense> recurringExpenses() {
        return recurringExpenseRepository.findAll();
    }

    @RequestMapping(value = "/oneTimeExpense", method = RequestMethod.POST)
    public long save(@RequestBody OneTimeExpense oneTimeExpense){
        return oneTimeExpenseRepository.save(oneTimeExpense).getId();
    }

    @RequestMapping(value = "/oneTimeExpense/{oneTimeExpenseId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long oneTimeExpenseId){
        oneTimeExpenseRepository.delete(oneTimeExpenseId);
    }

    @RequestMapping(value = "/oneTimeExpense", method = RequestMethod.PUT)
    public void update(@RequestBody OneTimeExpense oneTimeExpense){
        oneTimeExpenseRepository.save(oneTimeExpense);
    }

    @RequestMapping(value = "/recurringExpense", method = RequestMethod.POST)
    public long save(@RequestBody RecurringExpense recurringExpense){
        return recurringExpenseRepository.save(recurringExpense).getId();
    }

    @RequestMapping(value = "/recurringExpense/{recurringExpenseId}", method = RequestMethod.DELETE)
    public void deleteRecurringExpense(@PathVariable long recurringExpenseId){
        recurringExpenseRepository.delete(recurringExpenseId);
    }

    @RequestMapping(value = "/recurringExpense", method = RequestMethod.PUT)
    public void update(@RequestBody RecurringExpense recurringExpense){
        recurringExpenseRepository.save(recurringExpense);
    }}