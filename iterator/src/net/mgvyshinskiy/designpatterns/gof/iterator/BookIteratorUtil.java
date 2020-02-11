package net.mgvyshinskiy.designpatterns.gof.iterator;

import java.util.*;

public class BookIteratorUtil {
    public static <T extends Book> Iterator<T> getTitleIterator(List<T> list) {
        List<T> safeList = new ArrayList<>(list);
        safeList.sort(Comparator.comparing(Book::getTitle));
        return safeList.iterator();
    }

    public static <T extends Book> Iterator<T> getAuthorIterator(List<T> list) {
        List<T> safeList = new ArrayList<>(list);
        safeList.sort(Comparator.comparing(Book::getAuthor));
        return safeList.iterator();
    }

    public static <T extends Book> Iterator<T> getYearIterator(List<T> list) {
        List<T> safeList = new ArrayList<>(list);
        safeList.sort(Comparator.comparing(Book::getDate));
        return safeList.iterator();
    }
}
