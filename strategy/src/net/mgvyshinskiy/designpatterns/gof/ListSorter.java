package net.mgvyshinskiy.designpatterns.gof;

import java.util.List;

public class ListSorter {
    private ListSorter() {}

    public static <T extends Comparable<T>> void sortList(SortingStrategy strategy, List<T> list) {
        strategy.sort(list);
    }
}
