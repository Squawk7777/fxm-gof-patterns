package net.mgvyshinskiy.designpatterns.gof;

import java.util.List;

public class BubbleSortingStrategy<T extends Comparable<T>> implements SortingStrategy<T> {
    @Override
    public void sort(List<T> list) {
        System.out.println("Bubble sorting used");
        int listSize = list.size();
        boolean isSorted;
        T temp;

        for (int i = 0; i < listSize; i++) {
            isSorted = true;

            for (int j = 1; j < (listSize - i); j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                    isSorted = false;
                }
            }
            // avoid useless loop
            if (isSorted) break;
        }
    }
}
