package playground;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class NumbersTest {

    List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void test_map_multiplyByTwo() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        // Traditional
        assertThat(Numbers.multiplyByTwo(input))
                .isEqualTo(expected);

        // Functional
        assertThat(Numbers.multiplyByTwoFunctional(input))
                .isEqualTo(expected);
    }

    @Test
    public void test_filter_evenOnly() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);

        // Traditional
        assertThat(Numbers.filterEvenNumbers(input))
                .isEqualTo(expected);

        // Functional
        assertThat(Numbers.filterEvenNumbersFunctional(input))
                .isEqualTo(expected);
    }

    @Test
    public void test_reduce_sum() {
        Integer expected = 55;

        // Traditional
        assertThat(Numbers.sum(input))
                .isEqualTo(expected);

        // Functional
        assertThat(Numbers.sumFunctional(input))
                .isEqualTo(expected);
    }

    @Test
    public void test_sort_oddNumbersFirst() {
        List<Integer> expected = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        // Traditional
        assertThat(Numbers.sortOddFirst(input))
                .isEqualTo(expected);

        // Functional
        assertThat(Numbers.sortOddFirstFunctional(input))
                .isEqualTo(expected);
    }

}