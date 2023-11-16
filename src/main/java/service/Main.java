package service;

import service.converters.XmlToJson;

public class Main {
    public static void main(String[] args){
        XmlToJson converter = new XmlToJson();
        converter.convert("doramas.xml", "outdoramas.json");
    }
}
