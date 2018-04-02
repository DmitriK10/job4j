package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class BubleSortTest.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 02.04.2018
 */

public class BubbleSortTest {

    @Test
    public void whenBubbleSortArrayWithEvenAmountOfElementsThenSortedArray() {
        BubbleSort BubbleSort = new BubbleSort();
        int[] input = new int[] {5, 1, 2, 7, 4};
        int[] result = BubbleSort.bubblesort(input);
        int[] expect = new int[] {1, 2, 4, 5, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenBubbleSortArrayArrayWithOddAmountOfElementsThenSortedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {1, 2, 3, 4, 5, 6}.
        BubbleSort BubbleSort = new BubbleSort();
        int[] input = new int[] {5, 1, 1, 4, 4, 1, 2, 0};
        int[] result = BubbleSort.bubblesort(input);
        int[] expect = new int[] {0,1, 1, 1, 2, 4, 4, 5};
        assertThat(result, is(expect));
    }
}

