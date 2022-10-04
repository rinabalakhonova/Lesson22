package by.itstep.rinabalakhonava.model.logic;

public class ArraySorter {
    public static void bubbleSortAsc(int[] array) {

        for (int i = 0; 1 < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;

            }
        }
    }
}

