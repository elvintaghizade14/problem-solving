package az.et.job_interviews.aws2;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class SecondTask {
    private static final PriorityQueue<Data> DB = new PriorityQueue<>(11, new Comparator<Data>() {
        @Override
        public int compare(Data o1, Data o2) {
            return o1.compareTo(o2);
        }
    });

    private static class Data implements Comparable<Data> {
        private final String command;
        private final String itemName;
        private final BigDecimal price;
        private Integer shownTime;

        public Data(String command, String itemName, BigDecimal price, Integer shownTime) {
            this.command = command;
            this.itemName = itemName;
            this.price = price;
            this.shownTime = shownTime;
        }

        @Override
        public int compareTo(Data that) {
            int priceComparing = this.price.compareTo(that.price);
            int shownTime = that.shownTime.compareTo(this.shownTime);
            return priceComparing != 0 ? priceComparing : shownTime != 0 ? shownTime : this.itemName.compareTo(that.itemName);
        }

        @Override
        public String toString() {
            return itemName;
        }
    }

    public static List<String> getItems(List<List<String>> entries) {
        final List<String> result = new ArrayList<>();
        entries.forEach(entry -> {
            final String command = entry.get(0);
            if ("INSERT".equalsIgnoreCase(command)) insert(entry);
            else if ("VIEW".equalsIgnoreCase(command)) {
                result.add(view(entry));
            } else throw new IllegalArgumentException("Illegal entry: " + entry + " provided!");
        });
        return result;
    }

    private static String view(List<String> entry) {
        Data peeked = DB.peek();
        DB.remove(peeked);
        peeked.shownTime++;
        DB.add(peeked);
        return peeked.toString();
    }

    private static void insert(List<String> entry) {
        DB.add(
                new Data(
                        entry.get(0),
                        entry.get(1),
                        BigDecimal.valueOf(Double.parseDouble(entry.get(2))),
                        0
                )
        );
    }
}
