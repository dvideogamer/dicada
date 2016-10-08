package com.derek.repository;

/**
 * Created by Derek on 10/7/2016.
 */

import com.derek.model.RecurringIncome;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecurringIncomeRepository extends PagingAndSortingRepository<RecurringIncome, Long> {
}