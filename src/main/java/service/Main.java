package service;

import service.converters.XmlToJson;
import service.converters.JsonToXml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите расширение файла, который будете преобразовывать:\n" +
                "1).xml\n" +
                "2).json");
        int ex = in.nextInt();
        switch (ex)
        {
            case 1:
            {
                XmlToJson converter = new XmlToJson();
                converter.convert("doramas.xml", "outdoramas.json");
                break;
            }
            case 2:
            {
                JsonToXml converter = new JsonToXml();
                converter.convert("doramas.json", "outdoramas.xml");
                break;
            }
            default:
        }
    }
}
