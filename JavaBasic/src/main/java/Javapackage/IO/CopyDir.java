package Javapackage.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDir {
    public static void main(String[] args) {
        File file = new File("E:\\File\\Note");
        File file1 = new File("E:\\File\\notetest");
        copy(file, file1);
    }

    private static void copy(File file, File file1) {
        if (file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(file1.getAbsolutePath() + file.getAbsolutePath().substring(2))) {

                byte[] bytes = new byte[fis.available()];
                int count = 0;
                while ((count = fis.read(bytes)) != -1) {
                    fos.write(bytes,0,count);
                }
                fos.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }


        File newdir = new File(file1.getAbsolutePath() + file.getAbsolutePath().substring(2));
        if (!newdir.exists()) {
            newdir.mkdirs();
        }

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
            copy(f, file1);
        }
    }
}
