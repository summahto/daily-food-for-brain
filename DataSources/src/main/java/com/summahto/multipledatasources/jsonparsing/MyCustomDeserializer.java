package com.summahto.multipledatasources.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class MyCustomDeserializer extends KeyDeserializer {

    @Override
    public LocalDate deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        //Use the string key here to return a real map key object
        return null;
    }
}
