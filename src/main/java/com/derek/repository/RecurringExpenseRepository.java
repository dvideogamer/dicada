package com.derek.repository;

/**
 * Created by Derek on 10/7/2016.
 */

import com.derek.model.RecurringExpense;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecurringExpenseRepository extends PagingAndSortingRepository<RecurringExpense, Long> {
}