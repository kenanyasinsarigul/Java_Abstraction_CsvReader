package com.bocek.api;

import java.io.IOException;

public interface Reader<I, R> {

    R next();

    R convert(I input);

    void close() throws IOException;

    boolean hasNext() throws IOException;
}
