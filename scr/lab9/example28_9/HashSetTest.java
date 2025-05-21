package scr.lab9.example28_9;
import java.util.HashSet;
import java.util.*;

public class HashSetTest {
    private static final int SIZE = 8_000_000;

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(SIZE);

        // Генерация уникальных элементов для заполнения
        List<Integer> elementsToAdd = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            elementsToAdd.add(i);
        }

        System.out.println("Время добавления: " + add(hashSet, elementsToAdd) + " мс");
        System.out.println("Время удаления: " + remove(hashSet, elementsToAdd) + " мс");
        System.out.println("Время проверки наличия: " + testContains(hashSet, elementsToAdd) + " мс");
    }

    // добавление
    private static long add(Set<Integer> set, List<Integer> elements) {
        long start = System.currentTimeMillis();
        for (Integer element : elements) {
            set.add(element);
        }
        return System.currentTimeMillis() - start;
    }

    //  удаление
    private static long remove(Set<Integer> set, List<Integer> elements) {
        long totalTime = 0;
        for (Integer element : elements) {
            long start = System.currentTimeMillis();
            set.remove(element);
            totalTime += System.currentTimeMillis() - start;
        }
        return totalTime;
    }

    // проверка наличия
    private static long testContains(Set<Integer> set, List<Integer> elements) {
        long totalTime = 0;
        for (Integer element : elements) {
            long start = System.currentTimeMillis();
            set.contains(element);
            totalTime += System.currentTimeMillis() - start;
        }
        return totalTime;
    }
}
