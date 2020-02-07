package net.mgvyshinskiy.designpatterns.gof;

import java.util.List;

public class QuickSortingStrategy<T extends Comparable<T>> implements SortingStrategy<T> {
    @Override
    public void sort(List<T> list) {
        System.out.println("Quick sorting used");
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(List<T> list, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(list, begin, end);

            quickSort(list, begin, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, end);
        }
    }

    private int partition(List<T> list, int begin, int end) {
        T pivot = list.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (list.get(j).compareTo(pivot) < 1) {
                i++;

                T swapTemp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, swapTemp);
            }
        }

        T swapTemp = list.get(i + 1);
        list.set(i + 1, list.get(end));
        list.set(end, swapTemp);
        return ++i;
    }
}
