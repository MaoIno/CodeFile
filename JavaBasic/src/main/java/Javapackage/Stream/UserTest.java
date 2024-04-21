package Javapackage.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * ProjectName:CodeFile
 * Package:Javapackage.Stream
 * ClassName: UserTest
 * Description:
 * Author:YoungJan
 * Date:20/4/2024
 * Datetime:下午10:04
 * Version:Master_GitHub 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        /*UserService.getUser().stream().filter(user -> user.getAge() > 20).forEach(System.out::println); //输出user类中年龄大于20的
        Stream<String> stream = Stream.of("zhangsan", "lisi", "aa", "a");
        stream.filter(s -> s.length() > 3).forEach(System.out::println); //输出字符串长度大于三的*/

        //使用Stream的中间操作；Map方式，对数据进行转换
        /*Stream.of("a", "b", "c", "d").map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/
        /*Stream.of("a", "b", "c", "d").map(s -> s.toUpperCase()).forEach(System.out::println);*/


        /*List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));


        Stream<User> stream = list.stream();
        stream.filter(u->u.getGander().equals("man")).map(User::getName).forEach(System.out::println);*/


        /*List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> i = Arrays.asList(6, 7, 8, 9, 10);
        Stream<List<Integer>> stream = Stream.of(l, i);
        stream.flatMap(new Function<List<Integer>, Stream<?>>() {
            @Override
            public Stream<?> apply(List<Integer> integers) {
                return integers.stream();
            }
        }).forEach(System.out::println);
        stream.flatMap(List<Integer>::stream).forEach(System.out::println);*/

       /* List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 3, 6, 7, 8, 9);
        list.stream().distinct().forEach(System.out::println);*/

        /*List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));
        list.add(new User("zhangsan", 12, "man"));
        Stream<User> stream = list.stream();
        stream.distinct().forEach(System.out::println);*/

        /*List<Integer> list = Arrays.asList(2, 5, 6, 1, 3, 7, 8, 9, 4);
        list.stream().sorted((o1,o2)->o2-o1).forEach(System.out::println);*/

        /*List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));
        list.add(new User("zhangsan", 12, "man"));

        list.stream().distinct().sorted((o1, o2) -> o2.getAge() - o1.getAge()).map(User::getAge).forEach(System.out::println);*/

        /*List<Integer> list = Arrays.asList(2, 5, 6, 1, 3, 7, 8, 9, 4);
        list.stream().skip(3).limit(4).forEach(System.out::println);*/

        /*//匹配集合中是否都是3
        System.out.println(Arrays.asList(1, 2, 3, 4).stream().allMatch(i -> i.equals(3)));
        //匹配集合中是否没有3
        System.out.println(Arrays.asList(1, 2, 3, 4).stream().noneMatch(i -> i.equals(3)));
        //匹配集合中是否存在3
        System.out.println(Arrays.asList(1, 2, 3, 4).stream().anyMatch(i -> i.equals(3)));*/

        /*List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));
        list.add(new User("zhangsan", 12, "man"));
        System.out.println(list.stream().anyMatch(u -> "lisi".equals(u.getName()) && u.getAge()==12));*/
        /*List<Integer> list = Arrays.asList(2, 5);
        Stream<Integer> stream = list.stream();
        Integer i = stream.reduce(Math::multiplyExact).get();
        System.out.println(i);*/
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12, "man"));
        list.add(new User("lisi", 13, "man"));
        list.add(new User("wangwu", 54, "women"));
        list.add(new User("lili", 32, "women"));
        list.add(new User("zhangsan", 12, "man"));
        System.out.println(list.stream().count());
        System.out.println(list.stream().map(User::getAge).max((u1, u2) -> u1 - u2).get());
    }
}
