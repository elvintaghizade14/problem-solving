package job_interviews.aws;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> applicationPairs(int deviceCapacity, List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList) {
        TreeMap<Integer, Integer> foreMap = foregroundAppList.stream()
                .collect(Collectors.toMap(pair -> pair.get(1), pair -> pair.get(0), (a, b) -> b, TreeMap::new));
        TreeMap<Integer, Integer> backMap = backgroundAppList.stream()
                .collect(Collectors.toMap(pair -> pair.get(1), pair -> pair.get(0), (a, b) -> b, TreeMap::new));

        final List<List<Integer>> result = new ArrayList<>();

        int max = 0;
        foreMap.headMap(deviceCapacity)
                .forEach((memory, id) -> {
                    final int maxSearchedMem = deviceCapacity - memory;
                    List<Integer> pair =
                            backMap.keySet()
                                    .stream()
                                    .filter(compMem -> compMem <= maxSearchedMem)
                                    .max(Comparator.comparingInt(i -> i))
                                    .map(backMem -> {
                                        List<Integer> ids = new ArrayList<>();
                                        ids.add(id);
                                        ids.add(backMap.get(backMem));
                                        return ids;
                                    })
                                    .orElseGet(ArrayList::new);

                    result.add(pair);
                });
        return result;
    }
}
