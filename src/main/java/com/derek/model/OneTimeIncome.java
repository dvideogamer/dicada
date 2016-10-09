package com.derek.model;

import com.derek.serializers.CurrencySerializer;
import com.derek.serializers.DateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

import static com.derek.model.OneTimeIncome.TABLE_NAME;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name = TABLE_NAME)
public class OneTimeIncome extends AbstractModel {

    /** The ID database column name. */
    public static final String FIELD_ID = "ONE_TIME_INCOME_ID";

    /** The database table name. */
    public static final String TABLE_NAME = "ONE_TIME_INCOME";

    /** serialVersionUID. */
    private static final long serialVersionUID = 1726762801376541280L;

    @Id
    @SequenceGenerator(name = FIELD_ID + SEQUENCE, sequenceName = FIELD_ID + SEQ)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = FIELD_ID + SEQUENCE)
    @Column(name = FIELD_ID)
    private long id;

    private String name;

    @JsonSerialize(using = CurrencySerializer.class)
    private double amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    @JsonDeserialize(using = DateDeserializer.class)
    @Column(name = EFFECTIVE_DATE)
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