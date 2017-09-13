package OOP;


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
        List<Serializable> list = new ArrayList<>();
        show(list);

        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(1);
        integers.add(2);
        integers.add(-12);
        integers.add(22);


    }
}
