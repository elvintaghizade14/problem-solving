package az.et.hackerrank.day30Java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28_regex_patterns_intro_to_db {
  public static void main(String[] args) {
    String regEx = ".+@gmail\\\\.com$";
    Pattern p = Pattern.compile(regEx);
    Matcher abc = p.matcher("abc");
    ArrayList<String> names = new ArrayList<>();
//    names.add(firstName);
    names.sort(String::compareTo);
  }
}