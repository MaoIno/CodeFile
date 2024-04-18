package Javapackage.Reflect;

public class User01 {
    static{
        System.out.println("代码执行了");
    }
    String name;
    private int age;
    public String address = "shanghai";
    private boolean sex = true;

    public static final String COUNTRY = "中国";
    @Override
    public String toString() {
        return "User01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User01() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
