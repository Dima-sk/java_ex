package scr.lab9.example28_9;
import java.util.*;

public class testSortedSet {
    private static final int ELEMENT_COUNT = 8_000_000;

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 0; i < ELEMENT_COUNT; i++) {
            sortedSet.add(i);
        }

        List<Integer> listForIndexAccess = new ArrayList<>(sortedSet);

        System.out.println("Время добавления элемента в начало: " + addStart(new TreeSet<>(sortedSet)) + " мс");
        System.out.println("Время добавления элемента в конец: " + addEnd(new TreeSet<>(sortedSet)) + " мс");
        System.out.println("Время добавления элемента в середину: " + addMiddle(new TreeSet<>(sortedSet)) + " мс");

        System.out.println("Время удаления элемента из начала: " + removeStart(new TreeSet<>(sortedSet)) + " мс");
        System.out.println("Время удаления элемента из конца: " + removeEnd(new TreeSet<>(sortedSet)) + " мс");
        System.out.println("Время удаления элемента из середины: " + removeMiddle(new TreeSet<>(sortedSet)) + " мс");

        System.out.println("Время получения элемента по индексу: " + find(listForIndexAccess) + " мс");
    }

    // Добавление в начало
    private static long addStart(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.add(-1);
        return System.currentTimeMillis() - start;
    }

    // Добавление в конец
    private static long addEnd(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.add(ELEMENT_COUNT);
        return System.currentTimeMillis() - start;
    }

    // Добавление в середину
    private static long addMiddle(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.add(ELEMENT_COUNT / 2);
        return System.currentTimeMillis() - start;
    }

    // Удаление с начала
    private static long removeStart(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.remove(set.first());
        return System.currentTimeMillis() - start;
    }

    // Удаление с конца
    private static long removeEnd(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.remove(set.last());
        return System.currentTimeMillis() - start;
    }

    // Удаление из середины
    private static long removeMiddle(SortedSet<Integer> set) {
        Integer middleValue = ELEMENT_COUNT / 2;
        long start = System.currentTimeMillis();
        set.remove(middleValue);
        return System.currentTimeMillis() - start;
    }

    // Получение по индексу
    private static long find(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < list.size(); i++) {
                int value = list.get(i);
            }
        }

        return System.currentTimeMillis() - start;
    }
}