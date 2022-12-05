package az.et.kodlab;

import java.io.*;
import java.util.Arrays;

public class FileIO {
  public static void main(String[] args) {
    String filename = "C:\\Users\\Elvin\\IdeaProjects\\java-core-exercises\\src\\main\\java\\kodlab\\abc.txt";

    try {
      File file = new File(filename);
      FileWriter fw = new FileWriter(file, true);
      fw.write("Hello, World!\n");
      fw.write("This is second line. I am writing this to see will it appear at the 2nd line\n");
      fw.close();
    } catch (IOException ioe) {
      ioe.getStackTrace();
    }

    try {
      File file = new File(filename);
      FileWriter fw = new FileWriter(file, true);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("This is second writer with BufferedWriter\n");
      bw.close();
    } catch (IOException ioe) {
      ioe.getStackTrace();
    }

    try {
      File file = new File(filename);
      char[] read = new char[(int) file.length()];
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      int read1 = br.read(read);
      String output = new String(read);
      System.out.println(output);
      br.close();
    } catch (IOException ioe) {
      ioe.getStackTrace();
    }

    try {
      System.out.println("Second reader");
      File file = new File(filename);
      char[] read = new char[(int) file.length()];
      FileReader fr = new FileReader(file);
      int read1 = fr.read(read);
      String out = Arrays.toString(read);
      System.out.println(out);
      fr.close();
    } catch (IOException ioe) {
      ioe.getStackTrace();
    }
  }
}
