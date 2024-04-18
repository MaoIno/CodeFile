package Javapackage.annotation;

/**
 * ClassName: User
 * Description:
 * Author:YoungJan
 * Datetime:下午2:04
 * Version:Master_GitHub 1.0
 */

@MyAnnotation(name="zhangsan",age=10)
public class User {
    @MyAnnotation(name="lisi",age=23)
    public String name;

    public void sum(int i, int j) {
        System.out.println(i + j);
    }
}
