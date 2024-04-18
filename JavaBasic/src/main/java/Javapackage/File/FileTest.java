package Javapackage.File;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FileTest {
    public static void main(String[] args) throws Exception{
        File file = new File("e:/files.properties");
        System.out.println(file.exists() ? "exists" : "not exists");
        if(!file.exists()){
            file.createNewFile();
        }
        long l = file.lastModified();
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(date));
    }
}
