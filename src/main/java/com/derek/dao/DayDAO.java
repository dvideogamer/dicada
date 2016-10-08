package com.derek.dao;

import com.derek.model.Day;

import java.util.List;

public interface DayDAO {
    public void save(Day p);
    public List<Day> list();
}