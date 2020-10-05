package stackoverflow;

import java.util.Arrays;

public class CountForTitanic {

  static class Booking {
    final String name;
    final int id;
    final String movie;
    final String time;
    final String place;

    Booking(String name, int id, String movie, String time, String place) {
      this.name = name;
      this.id = id;
      this.movie = movie;
      this.time = time;
      this.place = place;
    }
  }

  public static void main(String[] args) {
    Booking[] bookings = {
            new Booking("Sam", 1, "titanic", "morning", "Stit1"),
            new Booking("Bill", 2, "titanic", "evening", "Btit1"),
            new Booking("Kik", 2, "lionking", "afternoon", "Btit1"),
    };

    long count = Arrays.stream(bookings)
            .map(b -> b.movie)
            .filter(m -> m.equals("titanic"))
            .count();

    System.out.printf("Count of people wanna watch `titanic`: %d", count);
  }
}