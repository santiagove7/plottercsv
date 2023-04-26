package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws Exception {
        CovidDataService c = new CovidDataService();
        String dataJson = c.get_countries_data(); //La app obtiene la data en formato JSON
        System.out.println(dataJson);
        AdapterToCsv adapter = new AdapterToCsv();
        String dataCsv = adapter.convert_to_csv(dataJson); //Por medio del adapter, se convierte la data a CSV
        System.out.println(dataCsv);
        CSVPlotter plotter = new CSVPlotter();
        System.out.println(plotter.plot_data(dataJson)); //No retorna la data
        System.out.println(plotter.plot_data(dataCsv)); //Retorna la data en formato CSV
    }
}