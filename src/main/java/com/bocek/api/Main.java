package com.bocek.api;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String line = "C:\\Users\\SARIGUL\\Desktop\\io-api\\files\\address.csv";

        CsvReader<String,Address> reader=new CsvReader(line,new myConverter());

        while (reader.hasNext()){
            String Ids = reader.next().getId();
            String cities = reader.next().getCity();
            String districts = reader.next().getDistrict();
            System.out.println("Id: " + Ids + " Şehir: " + cities + " İlçe: " + districts);
        }
    }
}
