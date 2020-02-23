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
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {5, 1, 2, 7, 4};
        int[] result = bubbleSort.bubblesort(input);
        int[] expect = new int[] {1, 2, 4, 5, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenBubbleSortArrayArrayWithOddAmountOfElementsThenSortedArray() {
        //напишите здесь тест, сортирующий массив с чётным числом элементов, например {5, 1, 1, 4, 4, 1, 2, 0}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {5, 1, 1, 4, 4, 1, 2, 0};
        int[] result = bubbleSort.bubblesort(input);
        int[] expect = new int[] {0, 1, 1, 1, 2, 4, 4, 5};
        assertThat(result, is(expect));
    }
}

