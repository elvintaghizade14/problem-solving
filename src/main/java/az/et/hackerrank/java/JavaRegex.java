package az.et.hackerrank.java;

public class JavaRegex {
  /*
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
  */
  class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    final String pattern = String.format("%s.%s.%s.%s", num, num, num, num);
  }
}