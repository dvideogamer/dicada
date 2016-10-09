package com.derek.controller;

import com.derek.model.OneTimeIncome;
import com.derek.model.RecurringIncome;
import com.derek.repository.OneTimeIncomeRepository;
import com.derek.repository.RecurringIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class IncomeController {

    @Autowired
    OneTimeIncomeRepository oneTimeIncomeRepository;

    @Autowired
    RecurringIncomeRepository recurringIncomeRepository;

    @RequestMapping("/oneTimeIncome")
    public Iterable<OneTimeIncome> oneTimeIncomes() {
        return oneTimeIncomeRepository.findAll();
    }

    @RequestMapping("/recurringIncome")
    public Iterable<RecurringIncome> recurringIncomes() {
        return recurringIncomeRepository.findAll();
    }

    @RequestMapping(value = "/oneTimeIncome", method = RequestMethod.POST)
    public long save(@RequestBody OneTimeIncome oneTimeIncome){
        return oneTimeIncomeRepository.save(oneTimeIncome).getId();
    }

    @RequestMapping(value = "/oneTimeIncome/{oneTimeIncomeId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long oneTimeIncomeId){
        oneTimeIncomeRepository.delete(oneTimeIncomeId);
    }

    @RequestMapping(value = "/oneTimeIncome", method = RequestMethod.PUT)
    public void update(@RequestBody OneTimeIncome oneTimeIncome){
        oneTimeIncomeRepository.save(oneTimeIncome);
    }

    @RequestMapping(value = "/recurringIncome", method = RequestMethod.POST)
    public long save(@RequestBody RecurringIncome recurringIncome){
        return recurringIncomeRepository.save(recurringIncome).getId();
    }

    @RequestMapping(value = "/recurringIncome/{recurringIncomeId}", method = RequestMethod.DELETE)
    public void deleteRecurringIncome(@PathVariable long recurringIncomeId){
        recurringIncomeRepository.delete(recurringIncomeId);
    }

    @RequestMapping(value = "/recurringIncome", method = RequestMethod.PUT)
    public void update(@RequestBody RecurringIncome recurringIncome){
        recurringIncomeRepository.save(recurringIncome);
    }
}