package com.derek.controller;

import com.derek.dao.DayDAO;
import com.derek.model.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class IncomeController {

    @Autowired
    DayDAO dao;

    @RequestMapping("/income")
    public List<Day> getDays() {
        return dao.list();
    }
}