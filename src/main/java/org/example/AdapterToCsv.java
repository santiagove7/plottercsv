package org.example;
import com.opencsv.CSVWriter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.StringWriter;
public class AdapterToCsv implements target{
    @Override
    public String convert_to_csv(String json) throws Exception{
        JSONArray jsonArray = new JSONArray(json);
        StringWriter stringWriter = new StringWriter();
        CSVWriter csvWriter = new CSVWriter(stringWriter);
        JSONObject first = jsonArray.getJSONObject(0);
        String[] header = new String[first.length()];
        int index = 0;
        for (String key : first.keySet()) {
            header[index++] = key;
        }
        csvWriter.writeNext(header);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String[] line = new String[obj.length()];
            index = 0;
            for (String key : obj.keySet()) {
                line[index++] = obj.get(key).toString();
            }
            csvWriter.writeNext(line);
        }
        csvWriter.close();
        return stringWriter.toString();
    }
}
