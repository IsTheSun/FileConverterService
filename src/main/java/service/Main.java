package service;

import service.converters.JsonToXml;

public class Main {
    public static void main(String[] args){
        JsonToXml converter = new JsonToXml();
        converter.convert("doramas.json", "outdoramas.xml");
    }
}