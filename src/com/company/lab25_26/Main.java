package com.company.lab25_26;

import org.json.simple.parser.ParseException;
import java.io.IOException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            Metro test=new Metro();
            test.getName();test.getLine();
            test.createJsonFile();
            test.JsonParser();}
        catch(IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
