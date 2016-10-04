package com.derek.controller;

import com.derek.dao.DaysDAO;
import com.derek.dao.DaysDAOImpl;
import com.derek.model.Days;
import com.derek.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Derek on 10/3/2016.
 */
@RestController
public class IncomeController {

     private DaysDAO daysDAO;

    @Autowired
    public IncomeController(DaysDAOImpl dao) {
        this.daysDAO = dao;
    }

    @RequestMapping("/days")
    public List<Days> getDays() {
        return daysDAO.list();
    }
}