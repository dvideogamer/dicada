package com.derek.model;

import com.derek.serializers.CurrencySerializer;
import com.derek.serializers.DateDeserializer;
import com.derek.serializers.DayIdSetDeserializer;
import com.derek.serializers.IdSetSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static com.derek.model.RecurringExpense.TABLE_NAME;

/**
 * Created by Derek on 10/8/2016.
 */
@Entity
@Table(name = TABLE_NAME)
public class RecurringExpense extends AbstractModel {

    /** The ID database column name. */
    public static final String FIELD_ID = "RECURRING_EXPENSE_ID";

    /** The database table name. */
    public static final String TABLE_NAME = "RECURRING_EXPENSE";

    /** The database link table name. */
    public static final String DAYS_LINK_TABLE = "RECURRING_EXPENSE_DAYS";

    /** serialVersionUID. */
    private static final long serialVersionUID = 1726752801270541288L;

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
    @Column(name = START_DATE)
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    @JsonDeserialize(using = DateDeserializer.class)
    @Column(name = END_DATE)
    private Date endDate;

    @OneToMany
    @JsonSerialize(using = IdSetSerializer.class)
    @JsonDeserialize(using = DayIdSetDeserializer.class)
    @JoinTable(
            name = DAYS_LINK_TABLE,
            joinColumns = @JoinColumn(name = FIELD_ID),
            inverseJoinColumns = @JoinColumn(name = Day.FIELD_ID)
    )
    private Set<Day> days;

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

    public Set<Day> getDays() {
        return days;
    }

    public void setDays(Set<Day> days) {
        this.days = days;
    }
}