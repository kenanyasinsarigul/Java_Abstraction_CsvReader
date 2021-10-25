package com.bocek.api;

public interface Converter<T,R> {
    R convert(T input);
}
