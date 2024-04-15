package Javapackage.IO;

import java.util.ResourceBundle;

public class BundlePropertiesTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("db");
        System.out.println(rb.getString("url"));
    }
}
