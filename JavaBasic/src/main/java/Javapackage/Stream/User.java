package Javapackage.Stream;

import java.util.Objects;

/**
 * ProjectName:CodeFile
 * Package:Javapackage.Stream
 * ClassName: User
 * Description:
 * Author:YoungJan
 * Date:20/4/2024
 * Datetime:下午9:57
 * Version:Master_GitHub 1.0
 */
public class User {
    private String name;
    private int age;
    private String gander;

    public User() {
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gander, user.gander);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gander);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                '}';
    }

    public User(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
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

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }
}
