package com.derek.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name="recurring_income")
public class RecurringIncome {

    @Id
    @Column(name="recurring_income_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String name;

    private double amount;

    @DateTimeFormat
    @Column(name="start_date")
    private Date startDate;

    @DateTimeFormat
    @Column(name="end_date")
    private Date endDate;
}