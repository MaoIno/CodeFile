package Javapackage.IO;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        String path = Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
        FileReader reader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(reader);
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String o = (String)enumeration.nextElement();
            String property = properties.getProperty(o);
            System.out.println(o + "=" + property);
        }

        reader.close();
    }
}
