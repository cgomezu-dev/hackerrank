package hackerrank.week1prep.day1;

import org.checkerframework.checker.units.qual.s;

public class TimeConversion {
    
    public static void main(String[] args) {
        String time = timeCoversion("12:45:54PM");

        System.out.println(time);
    }

    public static String timeCoversion(String s) {
        String[] timeArr = s.split(":");
        
        String hour = timeArr[0];
        String minute = timeArr[1];
        String second = timeArr[2].substring(0, 2);
        String period = timeArr[2].substring(2, 4);


        if (period.equals("PM") && !hour.equals("12")) {
            hour = String.valueOf(Integer.parseInt(hour) + 12);
        } else if (hour.equals("12") && period.equals("AM")) {
            hour = "00";
        }

        return hour + ":" + minute + ":" + second;
    }
}
