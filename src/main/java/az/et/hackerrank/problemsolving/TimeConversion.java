package az.et.hackerrank.problemsolving;

public class TimeConversion {
  public static void main(String[] args) {
    System.out.println(timeConversion("12:00:00AM"));
    System.out.println(timeConversion("12:00:00PM"));
    System.out.println(timeConversion("07:05:45PM"));
    System.out.println(timeConversion("12:40:22AM"));
    System.out.println(timeConversion("06:40:03AM"));
    System.out.println(timeConversion("12:45:54PM"));

  }

  private static String timeConversion(String s) {
    if ("12:00:00AM".contentEquals(s)) return "00:00:00";
    else if ("12:00:00PM".contentEquals(s)) return "12:00:00";
    else {
      int hh = Integer.parseInt(s.substring(0, 2));
      if ((hh < 12 && s.charAt(8) == 'A') || (hh == 12 && s.charAt(8) == 'P')) return s.substring(0, 8);
      else {
        hh = (hh + 12) % 24;
        return hh / 10 == 0 ? String.format("0%d:%s", hh, s.substring(3, 8)) : String.format("%d:%s", hh, s.substring(3, 8));
      }
    }
  }

}