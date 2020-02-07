package net.mgvyshinskiy.designpatterns.gof;

import java.util.Arrays;
import java.util.List;

public class StrategyApp {
    public static void main(String[] args) {
        Integer[] intArray = { 3, 54, 23, 12, 33, 55, 23, 42, 10, 2 };
        List<Integer> listOne = Arrays.asList(intArray);
        List<Integer> listTwo = Arrays.asList(intArray);

        ListSorter.sortList(new QuickSortingStrategy<>(), listOne);
        listOne.forEach(System.out::println);

        ListSorter.sortList(new BubbleSortingStrategy<>(), listTwo);
        listTwo.forEach(System.out::println);

        System.out.println(listOne.equals(listTwo) ? "Lists are equal" : "Lists are not equal");
    }
}
