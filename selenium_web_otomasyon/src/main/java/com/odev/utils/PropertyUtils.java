package com.odev.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    private static Properties properties = null;

    static public Properties instance(){
        if (properties == null) {
            PropertyUtils.instantiateProperties();
        }

        return properties;
    }

    static private void instantiateProperties() {
        try {
            properties = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/com/odev/config/config.properties");
            properties.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
