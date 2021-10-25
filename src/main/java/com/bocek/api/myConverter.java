package com.bocek.api;

public class myConverter implements Converter<String,Address>{
    @Override
    public Address convert(String input) {
        Address data = new Address();
        String[] arr = input.split(",");
        data.setId(arr[0]);
        data.setCity(arr[1]);
        data.setDistrict(arr[2]);
        return data;
    }
}
