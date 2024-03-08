package hackerrank.week1prep.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    
    public static void main(String[] args) {
        
        findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3));
    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());


        return arr.get(arr.size() / 2);
    }
}
