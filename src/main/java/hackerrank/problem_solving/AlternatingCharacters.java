package hackerrank.problem_solving;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class AlternatingCharacters {
  static class Pair<A, B> {
    final A a;
    final B b;

    Pair(A a, B b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public String toString() {
      return String.format("P[%s:%s]", a, b);
    }
  }

  static List<Character> sToList(String s) {
    return s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
  }

  static <C, A> A fold(Iterable<C> data, A initial, BiFunction<A, C, A> f) {
    Iterator<C> it = data.iterator();
    A acc = initial;
    System.out.println(acc);
    while (it.hasNext()) {
      acc = f.apply(acc, it.next());
      System.out.println(acc);
    }
    return acc;
  }

  static int alternatingCharacters(String s) {
    List<Character> chars = sToList(s);
    Pair<Integer, Character> initial = new Pair<>(0, '_');
    return fold(chars, initial,
            (p, c) -> c != p.b ? new Pair<>(p.a, c) : new Pair<>(p.a+1, c)
    ).a;
  }

  static int length(String s) {
    return fold(sToList(s), 0, (a, c) -> a+1);
  }

  static int min(String s) {
    return fold(sToList(s), Integer.MAX_VALUE, Math::min);
  }

  static Pair<Integer, Integer> minMax(String s) {
    Pair<Integer, Integer> initial = new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
    return fold(sToList(s), initial, (p, c) ->
            new Pair<>(
                    Math.min(p.a, c),
                    Math.min(p.b, c)
            ));
  }

  static Set<Character> unique(String s) {
    return fold(sToList(s), new HashSet<>(), (set, c) -> {
      set.add(c);
      return set;
    });
  }

  static Pair<List<Character>, List<Character>> splitLetters(String s) {
    return fold(sToList(s),
            new Pair<>(new ArrayList<>(), new ArrayList<>()),
            (vc, c) -> {
              if ("AEOUI".contains(String.valueOf(c))) {
                vc.a.add(c);
              } else {
                vc.b.add(c);
              }
              return new Pair<>(vc.a, vc.b);
            });
  }
}
