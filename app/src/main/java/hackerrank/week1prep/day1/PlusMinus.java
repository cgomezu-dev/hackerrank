package hackerrank.week1prep.day1;

import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        
        plusMinus(List.of(1, 1, 0, -1, -1));
    }

    public static void plusMinus(List<Integer> arr) {

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) <= -1) {
                countNegative++;
            } else if (arr.get(j) >= 1) {
                countPositive++;
            } else {
                countZero++;
            }
        }
        
        double ratioPositive = (double) countPositive / arr.size();
        double ratioNegative = (double) countNegative / arr.size();
        double ratioZero = (double) countZero / arr.size();

        System.out.printf("%.4f\n", ratioPositive);
        System.out.printf("%.4f\n", ratioNegative);
        System.out.printf("%.4f\n", ratioZero);


    }
    
}