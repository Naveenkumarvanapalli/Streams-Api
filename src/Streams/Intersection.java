package Streams;

import java.util.Arrays;
import java.util.List;

public class Intersection {
//    Common Elements
public static void main(String[] args) {
    List<Integer> list_1 = Arrays.asList(1,2,3,9,8,7,4);
    List<Integer> list_2 = Arrays.asList(3,5,9,10,14,11,15,13);

    List<Integer> integerList = list_1.stream()
            .filter(list -> {
                return list_2.contains(list);
            })
            .toList();
    integerList.forEach(System.out::println);
}
}
