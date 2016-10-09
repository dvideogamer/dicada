package com.derek.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by Derek on 10/8/2016.
 */
public class CurrencySerializer extends JsonSerializer<Double> {

    private DecimalFormat df = new DecimalFormat("#.00");

    @Override
    public void serialize(Double value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeNumber(df.format(value));
    }
}