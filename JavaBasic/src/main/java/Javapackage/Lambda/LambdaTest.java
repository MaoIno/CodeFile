package Javapackage.Lambda;

import java.util.*;
import java.util.function.*;

/**
 *
 * ClassName: LambdaTest
 * Description:
 * Author:YoungJan
 * Datetime:下午5:38
 * Version:Master_GitHub 1.0
 */
public class LambdaTest {
    public static void main(String[] args) {
        /*TreeSet<Integer> i = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/
        /*TreeSet<Integer> i = new TreeSet<>((o1, o2) -> o2 - o1);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);

        System.out.println(i);*/


        /*List<Integer> list = Arrays.asList(12,41,412,4);
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);*/
        /*nono no = new nono() {
            @Override
            public int test(Integer value) {
                return value;
            }
        };
        nono no1 = value -> value;

        System.out.println(no.test(1));
        System.out.println(no1.test(2));*/


        /*Supplier<String> su = new Supplier<String>() {
            @Override
            public String get() {
                return t.getName();
            }
        };
        Supplier<String> sup = () -> t.getName();
        Supplier<String> supp = t::getName;
        System.out.println(supp.get());
        System.out.println(sup.get());
        System.out.println(su.get());*/
        /*Teacher t = new Teacher("zhangsan");
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> cons = (s) -> System.out.println(s);
        Consumer<String> consu =System.out::println;
        con.accept("======");
        cons.accept("++++++++");
        consu.accept("--------");*/

        /*Function<Double,Long> fun = new Function<Double,Long>() {
            @Override
            public Long apply(Double doubles) {
                return Math.round(doubles);
            }
        };
        Function<Double, Long> func = doubles -> Math.round(doubles);
        Function<Double,Long> funct = Math::round;
        System.out.println(funct.apply(3.14));
        System.out.println(func.apply(2.4));
        System.out.println(fun.apply(2.3));*/

        /*Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Comparator<Integer> comp = (o1, o2) -> o1.compareTo(o2);
        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println(comparator.compare(3, 5));
        System.out.println(comp.compare(3, 1));
        System.out.println(com.compare(22, 3));
*/
        /*Teacher t = new Teacher("zhangsan");
        Function<Teacher,String> f =new Function<Teacher, String>() {
            @Override
            public String apply(Teacher teacher) {
                return teacher.getName();
            }

        };
        Function<Teacher,String> fun = teacher->t.getName();
        Function<Teacher,String> func = Teacher::getName;
        System.out.println(func.apply(t));
        System.out.println(fun.apply(t));
        System.out.println(f.apply(t));*/
        /*Supplier<Teacher> s = new Supplier<Teacher>() {
            @Override
            public Teacher get() {
                return new Teacher();
            }
        };
        Supplier<Teacher> su = () -> new Teacher();
        Supplier<Teacher> sup = Teacher::new;
        System.out.println(sup.get());
        System.out.println(su.get());
        System.out.println(s.get());*/
        /*Function<String,Teacher> f = new Function<String, Teacher>() {
            @Override
            public Teacher apply(String s) {
                return new Teacher(s);
            }
        };
        Function<String,Teacher> fu = (s) -> new Teacher(s);
        Function<String,Teacher> fuc = Teacher::new;
        System.out.println(fuc.apply("wangwu").getName());
        System.out.println(fu.apply("lisi").getName());
        System.out.println(f.apply("zhangsan").getName());*/
        /*Function<Integer,int[]> f = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        Function<Integer, int[]> fu = (i) -> new int[i];
        Function<Integer,int[]> fuc = int[]::new;
        System.out.println(fuc.apply(4).length);
        System.out.println(fu.apply(3).length);
        System.out.println(f.apply(2).length);*/
        /*List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println("\n");
        l.forEach(i-> System.out.print(i+" "));
        System.out.println("\n");
        l.forEach(System.out::println);*/
        /*Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");
        map.put(6, "6");
        map.put(7, "7");
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + "=" + s);
            }
        });
        System.out.println("===========");
        map.forEach((i,v)-> System.out.println(i+"="+v));
        System.out.println("===========");*/
        /*List<String> l = new ArrayList<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        l.add("dd");
        l.add("ee");
        l.add("ff");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer==2;
            }
        });
        System.out.println(list);
        list.removeIf(i -> 5 == i);
        System.out.println(list);
        l.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "cc".equals(s);
            }
        });
        System.out.println(l);
        l.removeIf(s -> "aa".equals(s));
        System.out.println(l);
        l.removeIf("ff"::equals);
        System.out.println(l);*/
        Set<String> s = new HashSet<>();
        s.add("100");
        s.add("200");
        s.add("300");
        s.add("400");
        s.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "200".equals(s);
            }
        });
        System.out.println(s);
        s.removeIf(i -> "300".equals(i));
        System.out.println(s);
        s.removeIf("100"::equals);
        System.out.println(s);
    }
}
@FunctionalInterface
interface nono{
    int test(Integer value);
}
class Teacher{
    private String name;


    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                '}';
    }
    public Teacher(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
