package self.hackerrank.java.algorithms.warmup.easy;

import java.util.HashMap;
import java.util.Map;

public class TimeConversion {

    static final Map<String, String> hourConvertorChart = new HashMap<String, String>() {
        {
            put("12AM", "00");
            put("01PM", "13");
            put("02PM", "14");
            put("03PM", "15");
            put("04PM", "16");
            put("05PM", "17");
            put("06PM", "18");
            put("07PM", "19");
            put("08PM", "20");
            put("09PM", "21");
            put("10PM", "22");
            put("11PM", "23");
            put("12PM", "12");

        }
    };

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45PM"));
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    // sample input 07:05:45PM
    public static String timeConversion(String time) {
        // Write your code here

        String format24 = null;

        assert time != null;
        assert !time.equals("");

        String min = time.substring(3, 5);
        String secs = time.substring(6, 8);
        String hour = time.substring(0, 2);
        String timezone = time.substring(8, 10);

        if (hourConvertorChart.containsKey(hour + timezone)) {
            hour = hourConvertorChart.get(hour + timezone);
        }
        format24 = hour + ":" + min + ":" + secs;

        return format24;

    }

}
