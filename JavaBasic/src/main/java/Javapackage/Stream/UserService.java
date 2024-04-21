package Javapackage.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectName:CodeFile
 * Package:Javapackage.Stream
 * ClassName: UserService
 * Description:
 * Author:YoungJan
 * Date:20/4/2024
 * Datetime:下午9:59
 * Version:Master_GitHub 1.0
 */
public class UserService {
    public static List<User> getUser(){

        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));

        return list;
    }
}
