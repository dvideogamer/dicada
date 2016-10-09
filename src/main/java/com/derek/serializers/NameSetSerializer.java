package com.derek.serializers;

import com.derek.model.AbstractModel;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Derek on 10/8/2016.
 */
public class NameSetSerializer extends JsonSerializer<Set<AbstractModel>> {

    @Override
    public void serialize(Set<AbstractModel> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        value.forEach(model -> list.add(model.getName()));
        jgen.writeObject(list);
    }
}