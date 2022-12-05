package az.et.job_interviews.aws2;

import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {
    public static List<Integer> chooseFleets(List<Integer> wheels) {
        return wheels.stream().map(wheel -> {
            if (wheel % 2 != 0) return 0;
            return Math.floorDiv((int) Math.log10(wheel), (int) Math.log10(2));
        }).collect(Collectors.toList());
    }
}
