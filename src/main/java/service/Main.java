package service;

import service.converters.JsonToXml;
import service.converters.XmlToJson;


import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    System.out.println("Выберите расширение файла, который будете преобразовывать:\n" +
            "1).xml\n" +
            "2).json")
    int ex = in.nextInt();
    switch(ex){
        case 1:{
            XmlToJson converter = new XmlToJson();
            converter.convert("doramas.xml", "outdoramas.json");
            break;
        }
        case 2:{
            XmlToJson converter = new XmlToJson();
            converter.convert("doramas.xml", "outdoramas.json");
            break;
        }
        default:
    }
}
