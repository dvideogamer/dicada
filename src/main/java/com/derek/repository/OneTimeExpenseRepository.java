package com.derek.repository;

/**
 * Created by Derek on 10/7/2016.
 */

import com.derek.model.OneTimeExpense;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OneTimeExpenseRepository extends PagingAndSortingRepository<OneTimeExpense, Long> {
}