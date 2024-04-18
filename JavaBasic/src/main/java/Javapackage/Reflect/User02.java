package Javapackage.Reflect;

public class User02 {
    static{
        System.out.println("User02代码执行了");
    }
    String name;
    int age;

    @Override
    public String toString() {
        return "User02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User02() {
    }

    public User02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sums(String name , int age) {

        return "name:" + name + " age:" + age;
    }

    public void vLog() {
        System.out.println("exit");
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
