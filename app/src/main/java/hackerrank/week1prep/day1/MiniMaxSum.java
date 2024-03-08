package hackerrank.week1prep.day1;

import java.util.List;

public class MiniMaxSum {
    
    public static void main(String[] args) {
        //miniMaxSum(List.of(1,3,5,7,9));
        //miniMaxSum(List.of(426980153, 354802167, 142980735, 968217435, 734892650));
        miniMaxSum(List.of(769082435, 210437958, 673982045, 375809214, 380564127));
    }

    public static void miniMaxSum(List<Integer> arr) {
        long minimumSum = 0;
        long maximumSum = 0;

        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (j == i) {
                    continue;
                }
                sum += arr.get(j);     
            }

            if (minimumSum == 0) {
                minimumSum = sum;
                maximumSum = sum;
            }

            if (sum >= maximumSum) {
                maximumSum = sum;
            } else if (sum < minimumSum) {
                minimumSum = sum;
            }

            sum = 0;
        }

        System.out.println(minimumSum + " " + maximumSum);
    }
}
