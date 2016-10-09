package com.derek.model;

import com.derek.serializers.CurrencySerializer;
import com.derek.serializers.DateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name="one_time_income")
public class OneTimeIncome implements Serializable{

    //AUTO necessary for postgres
    @Id
    @SequenceGenerator(name="one_time_income_id_sequence", sequenceName="one_time_income_id_seq")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="one_time_income_id_sequence")
    @Column(name="one_time_income_id")
    private long id;

    private String name;

    @JsonSerialize(using = CurrencySerializer.class)
    private double amount;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM/dd/yyyy")
    @JsonDeserialize(using = DateDeserializer.class)
    @Column(name="effective_date")
    private Date effectiveDate;

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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}