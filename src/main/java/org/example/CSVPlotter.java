package org.example;

public class CSVPlotter {

    public String plot_data(String data){
        if (data.contains("[") && data.contains("]")){
            return "Error, no se puede imprimir JSON";
        } else{
            return data;
        }
    }
}
