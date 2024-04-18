package Javapackage.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ResourceBundle;

@MyAnnotation()
public class AnnotationTest {
    //MyAnnotations m = new MyAnnotations();
    public static void main(String[] args) throws Exception{
        /*ResourceBundle rb = ResourceBundle.getBundle("files");
        String className = rb.getString("classNames");
        Class c = Class.forName(className);
        Field name = c.getDeclaredField("name");
        MyAnnotation a1 = ((MyAnnotation) c.getAnnotation(MyAnnotation.class));
        System.out.println(a1.name());

        if (name.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = name.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name());
        }*/
        String string = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
        System.out.println(string);
    }

}

class MyAnnotations{
    public void sum() {
        System.out.println("do some");

    }
}
