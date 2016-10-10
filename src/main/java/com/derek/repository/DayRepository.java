package com.derek.repository;

/**
 * Created by Derek on 10/7/2016.
 */

import com.derek.model.Day;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DayRepository extends PagingAndSortingRepository<Day, Long> {
    Day findByName(String name);
}