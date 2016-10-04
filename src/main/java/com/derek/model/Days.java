package com.derek.model;

import javax.persistence.*;

/**
 * Created by Derek on 10/3/2016.
 */
@Entity
@Table(name="days")
public class Days {

    @Id
    @Column(name="day_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}