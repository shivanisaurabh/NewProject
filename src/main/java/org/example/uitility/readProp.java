package org.example.uitility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProp {
    private static Properties prop;
    public static void loadProperties()  {
        prop = new Properties();
        FileInputStream file= null;
        try {
            file = new FileInputStream("src//main//resources//Data//userid.properties");
            prop.load(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String get(String key) {
        if (prop == null) loadProperties();
        return prop.getProperty(key);
    }
}
