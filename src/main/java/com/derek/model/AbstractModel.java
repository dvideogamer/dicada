package com.derek.model;

import java.io.Serializable;

/**
 * Created by Derek on 10/9/2016.
 */

public abstract class AbstractModel implements Serializable {

    /** The standard date/time format. */
    protected static final String DATE_TIME_FORMAT = "MM/dd/yyyy";

    /** sequence suffix */
    protected static final String SEQ = "_SEQ";

    /** sequence full word */
    protected static final String SEQUENCE = "_SEQUENCE";

    /** start date variable */
    protected static final String START_DATE = "START_DATE";

    /** end date variable */
    protected static final String END_DATE = "END_DATE";

    /** effective date variable */
    protected static final String EFFECTIVE_DATE = "EFFECTIVE_DATE";

    abstract public long getId();

    abstract public void setId(long id);

    abstract public String getName();

    abstract public void setName(String name);
}