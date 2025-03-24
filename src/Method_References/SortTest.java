package Method_References;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
//        First Way
        List<Integer> integerList = Arrays.asList(8,10,12,2,5,3,9,7,8,10,46,23);
        System.out.println("Before Sorting :" + integerList);
        ISort iSort = (list) -> {
            Collections.sort(list);
        };
        iSort.customSort(integerList);
        System.out.println("After Sorting :" + integerList);

//     Second Way
        List<Integer> integerList1 = Arrays.asList(32,20,26,1,5,96,75,100);
        System.out.println("Before Sorting :" + integerList1);
        ISort iSort1 = Collections::sort;
        iSort1.customSort(integerList1);
        System.out.println("After Sorting :" + integerList1);
    }
}
