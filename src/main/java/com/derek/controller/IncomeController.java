package com.derek.controller;

import com.derek.model.Day;
import com.derek.model.OneTimeIncome;
import com.derek.model.RecurringIncome;
import com.derek.repository.DayRepository;
import com.derek.repository.OneTimeIncomeRepository;
import com.derek.repository.RecurringIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class IncomeController {

    @Autowired
    OneTimeIncomeRepository oneTimeIncomeRepository;

    @Autowired
    RecurringIncomeRepository recurringIncomeRepository;

    @RequestMapping("/oneTimeIncomes")
    public Iterable<OneTimeIncome> oneTimeIncomes() {
        return oneTimeIncomeRepository.findAll();
    }

    @RequestMapping("/recurringIncomes")
    public Iterable<RecurringIncome> recurringIncomes() {
        return recurringIncomeRepository.findAll();
    }
}