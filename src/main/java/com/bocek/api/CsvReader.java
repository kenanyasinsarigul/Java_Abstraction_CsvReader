package com.bocek.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader<I extends String, R> implements Reader<I, R> {
    private final Converter<String, R> converter;
    private final BufferedReader reader;
    private String line;

    public CsvReader(String file, Converter<String, R> converter) throws FileNotFoundException {
        this.converter = converter;
        this.reader = new BufferedReader(new FileReader(file));
    }

    @Override
    public R next() {
        return this.convert(line);
    }

    @Override
    public R convert(String input) {
        return converter.convert(line);
    }


    @Override
    public void close() throws IOException {
        reader.close();
    }

    @Override
    public boolean hasNext() throws IOException {
        line = reader.readLine();

        return line != null;
    }
}