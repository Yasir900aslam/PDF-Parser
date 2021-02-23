package Util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;

public class Serializer {

    public Gson gson;
    public FileWriter file ;


    public Serializer ( String name) throws IOException {
        this.gson = new GsonBuilder()
                .enableComplexMapKeySerialization()
                .serializeNulls()
                .setDateFormat(DateFormat.LONG)
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .setVersion(1.0)
                .create();

        this.file = new FileWriter(name);
    }

    public void to_json (ArrayList<Footer> footer) throws IOException {
        this.file.write(this.gson.toJson(footer));
    }
}
