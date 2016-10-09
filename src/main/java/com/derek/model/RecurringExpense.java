package com.derek.model;

import com.derek.serializers.CurrencySerializer;
import com.derek.serializers.DateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name="recurring_expense")
public class RecurringExpense {

    @Id
    @SequenceGenerator(name="recurring_expense_id_sequence", sequenceName="recurring_expense_id_seq")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="recurring_expense_id_sequence")
    @Column(name="recurring_expense_id")
    private long id;

    private String name;

    @JsonSerialize(using = CurrencySerializer.class)
    private double amount;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM/dd/yyyy")
    @JsonDeserialize(using = DateDeserializer.class)
    @Column(name="start_date")
    private Date startDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM/dd/yyyy")
    @JsonDeserialize(using = DateDeserializer.class)
    @Column(name="end_date")
    private Date endDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}