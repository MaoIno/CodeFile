package Javapackage.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: StreamTest
 * Description:
 * Author:YoungJan
 * Datetime:下午4:16
 * Version:Master_GitHub 1.0
 */
public class StreamTest {
    public static void main(String[] args) {
        /*//使用Collection调用方法
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        System.out.println(stream);
        //使用Collection调用方法
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        Stream<Integer> stream1 = list1.stream();
        System.out.println(stream1);

        //使用静态方法
        String[] arrays = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arrays);
        System.out.println(stream2);

        //使用接口方法
        Stream<String> st = Stream.of("a", "b", "c");
        //可以直接定义，也可以传入一个数组
        Stream<String> str = Stream.of(arrays);
        System.out.println(st);
        System.out.println(str);*/


        /*Stream<String> stream = Stream.of("a", "b", "c", "d");
        System.out.println(stream);
        System.out.println(stream.isParallel());
        Stream<String> parallel = stream.parallel();
        System.out.println(parallel.isParallel());
        System.out.println(parallel);
        System.out.println(stream == parallel);*/

        /*List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.parallelStream();
        System.out.println(stream.isParallel());*/

    }
}
