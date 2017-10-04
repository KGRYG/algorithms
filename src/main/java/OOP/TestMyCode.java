package OOP;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Serializable;
import java.util.*;

class TestMyCode {

    public static void show(List<? super Number> list) {
        list.add(new Integer(4));
    }

    public static void show2(List<? extends Number> list) {
        list.forEach(System.out::println);
    }


    public static void main(String[] args) {
        System.out.println(SingletonEnum.Instance == SingletonEnum.Instance);

    }
}
