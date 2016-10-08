package com.derek.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Derek on 10/3/2016.
 */
@Entity
@Table(name="days")
public class Day implements Serializable {

    protected Day() {}

    public Day(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name="day_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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