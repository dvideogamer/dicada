package com.derek.model;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name="one_time_income")
public class OneTimeIncome implements Serializable{

    @Id
    @Column(name="one_time_income_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String name;

    private double amount;

    @DateTimeFormat
    @Column(name="effective_date")
    private Date effectiveDate;
}