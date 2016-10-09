package com.derek.model;

import javax.persistence.*;

import static com.derek.model.Day.TABLE_NAME;

/**
 * Created by Derek on 10/3/2016.
 */
@Entity
@Table(name = TABLE_NAME)
public class Day extends AbstractModel {

    /** The ID database column name. */
    public static final String FIELD_ID = "DAY_ID";

    /** The database table name. */
    public static final String TABLE_NAME = "DAYS";

    /** serialVersionUID. */
    private static final long serialVersionUID = 1726739056876541979L;

    @Id
    @SequenceGenerator(name = TABLE_NAME + "_" + FIELD_ID + SEQUENCE, sequenceName = TABLE_NAME + "_" + FIELD_ID + SEQ)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = TABLE_NAME + "_" + FIELD_ID + SEQUENCE)
    @Column(name = FIELD_ID)
    private long id;

    private String name;

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
}