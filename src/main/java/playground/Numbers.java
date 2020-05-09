package playground;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static List<Integer> multiplyByTwo(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : input) {
            result.add(integer * 2);
        }
        return result;
    }

    public static List<Integer> multiplyByTwoFunctional(List<Integer> input) {
        return input
                .stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
    }

    public static List<Integer> filterEvenNumbers(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : input) {
            if (integer % 2 == 0) result.add(integer);
        }
        return result;
    }

    public static List<Integer> filterEvenNumbersFunctional(List<Integer> input) {
        return input
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> input) {
        Integer result = 0;
        for (Integer integer : input) {
            result += integer;
        }
        return result;
    }

    public static Integer sumFunctional(List<Integer> input) {
        return input
                .stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> sortOddFirst(List<Integer> input) {
        input.sort(Comparator.reverseOrder()); // mutates list
        return input;
    }

    public static List<Integer> sortOddFirstFunctional(List<Integer> input) {
        return input
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
