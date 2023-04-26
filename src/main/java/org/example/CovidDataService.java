package org.example;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CovidDataService {
    public String get_countries_data() throws JsonProcessingException{
        List<Country> data = new ArrayList<Country>();
        data.add(new Country("México", 126190788, "Ciudad de México"));
        data.add(new Country("Estados Unidos", 328239523, "Washington D.C."));
        data.add(new Country("Canadá", 37670617, "Ottawa"));

        // Convertir la lista de objetos a formato JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(data);

        return json;
    }

    public String get_countries_historic_data(){
        return "JSON";
    }
}
