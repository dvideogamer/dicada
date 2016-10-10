package com.derek.serializers;

import com.derek.model.Day;
import com.derek.repository.DayRepository;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Derek on 10/8/2016.
 */
public class DayNameSetDeserializer extends JsonDeserializer<Set<Day>> {

    @Autowired
    private DayRepository repository;

    @Override
    public Set<Day> deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext) throws IOException {
        if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY) {
            Set<Day> permissions = new HashSet<>();
            while(jsonparser.nextToken() != JsonToken.END_ARRAY) {
                permissions.add(repository.findByName(jsonparser.getText()));
            }
            return permissions;
        }
        throw deserializationcontext.mappingException("Expected Permissions list");
    }
}