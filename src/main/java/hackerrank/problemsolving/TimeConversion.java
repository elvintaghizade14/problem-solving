package hackerrank.problemsolving;

public class TimeConversion {
  public static void main(String[] args) {
    System.out.println(timeConversion("12:00:00AM"));
    System.out.println(timeConversion("12:00:00PM"));
    System.out.println(timeConversion("07:05:45PM"));
    System.out.println(timeConversion("12:40:22AM"));
    System.out.println(timeConversion("06:40:03AM"));

  }

  private static String timeConversion(String s) {
    if (s.contentEquals("12:00:00AM")) return "00:00:00";
    else if (s.contentEquals("12:00:00PM")) return "12:00:00";
    else {
      return String.format("%s:%s",
              hour(s.substring(0, 2)),
              s.substring(3, 8));
    }
  }

  private static String hour(String hh) {
    int h = (Integer.parseInt(hh) + 12) % 24;
    return h == 0 ? "00" : String.valueOf(h);
  }

}
