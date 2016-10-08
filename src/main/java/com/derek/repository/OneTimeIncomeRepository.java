package com.derek.repository;

/**
 * Created by Derek on 10/7/2016.
 */

import com.derek.model.OneTimeIncome;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OneTimeIncomeRepository extends PagingAndSortingRepository<OneTimeIncome, Long> {
}