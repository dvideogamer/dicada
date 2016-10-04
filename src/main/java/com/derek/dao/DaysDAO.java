package com.derek.dao;

import com.derek.model.Days;
import java.util.List;

public interface DaysDAO {
    public void save(Days p);
    public List<Days> list();
}