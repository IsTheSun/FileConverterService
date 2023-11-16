package service.converters;

import service.structure.Dorama;
import service.structure.Country;
import service.readers.ReaderJson;
import service.writers.WriterXml;

import java.util.ArrayList;

public class JsonToXml implements Converter{
    @Override
    public void convert(String inputFile, String outputFile) {
        ReaderJson reader = new ReaderJson();
        ArrayList<Country> countries = (ArrayList<Country>) reader.readFile("src\\main\\rec\\" + inputFile);
        ArrayList<Dorama> doramas = convertCountries(countries);
        WriterXml writer = new WriterXml();
        writer.write(doramas, "src\\main\\rec\\" + outputFile);
    }
    private ArrayList<Dorama> convertCountries(ArrayList<Country> countries){
        ArrayList<Dorama> doramas = new ArrayList<>();
        for (Country country : countries){
            ArrayList<Dorama> countryDoramas = country.getDoramas();
            doramas.addAll(countryDoramas);
        }
        return doramas;
    }
}
