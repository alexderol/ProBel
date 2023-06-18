package com.abeyis.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        try {
            //2- We need to open (reading) the file in java memory
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- We need to make the properties object to load the file
            properties.load(file);
            file.close();// close the file since it has served its purpose
        } catch (IOException e) {
            System.out.println("File not found in Configuration Reader Class");
            e.printStackTrace();
        }
    }

    public static String getProperty (String keyword) {
        return properties.getProperty(keyword);
    }

}

