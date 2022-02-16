package com.hackerrank.ipk.one_week_prep.day1;

public class TimeConversion {
    public static String timeConversion(String time) {

        int hour = Integer.parseInt(time.substring(0, 2));
        final int minute = Integer.parseInt(time.substring(3, 5));
        final int second = Integer.parseInt(time.substring(6, 8));
        final String meridiem = time.substring(8, 10);

        hour += ((meridiem.equals("PM") && hour != 12) ? 12 : 0);
        hour -= ((meridiem.equals("AM") && hour == 12) ? 12 : 0);

        return String.format("%02d", hour) + ":"
                + String.format("%02d", minute) + ":"
                + String.format("%02d", second);

    }

    public static void main(String[] args) {
        timeConversion("12:01:00PM");
        timeConversion("12:01:00AM");
        timeConversion("07:05:45PM");
    }
}
