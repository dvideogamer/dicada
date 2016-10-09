package com.derek.serializers;

import com.derek.model.AbstractModel;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by Derek on 10/8/2016.
 */
public class IdSerializer extends JsonSerializer<AbstractModel> {

    @Override
    public void serialize(AbstractModel value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeNumber(value.getId());
    }
}