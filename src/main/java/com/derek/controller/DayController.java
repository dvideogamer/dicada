package com.derek.controller;

import com.derek.model.Day;
import com.derek.repository.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class DayController {

    @Autowired
    DayRepository repository;

    @RequestMapping("/dayes")
    public Iterable<Day> getDays() {
        return repository.findAll();
    }
}