package scr.lab9.example28_9;

import java.util.List;

public class testArrayList {
    private static final int SIZE = 8_000_000;

    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        System.out.println("Время добавления в начало: " + addStart(list) + " мс");
        System.out.println("Время добавления в конец: " + addEnd(list) + " мс");
        System.out.println("Время добавления в середину: " + addMiddle(list) + " мс");
        System.out.println("Время удаления из начала: " + removeStart(list) + " мс");
        System.out.println("Время удаления из конца: " + removeEnd(list) + " мс");
        System.out.println("Время удаления из середины: " + removeMiddle(list) + " мс");
        System.out.println("Время получения по индексу (все): " + find(list) + " мс");
    }

    // 1. Добавление в начало
    private static long addStart(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(0, Integer.MAX_VALUE);
        }
        return System.currentTimeMillis() - start;
    }

    // 2. Добавление в конец
    private static long addEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(Integer.MAX_VALUE);
        }
        return System.currentTimeMillis() - start;
    }

    // 3. Добавление в середину
    private static long addMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(SIZE / 2, Integer.MAX_VALUE);
        }
        return System.currentTimeMillis() - start;
    }

    // 4. Удаление из начала
    private static long removeStart(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    // 5. Удаление из конца
    private static long removeEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    // 6. Удаление из середины
    private static long removeMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(SIZE / 2);
        }
        return System.currentTimeMillis() - start;
    }

    // 7. Получение по индексу
    private static long find(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int j = 0; j < 1000; j++) { // 1000 * 8 млн = 8 млрд обращений
            for (int i = 0; i < list.size(); i++) {
                int value = list.get(i);
            }
        }

        return System.currentTimeMillis() - start;
    }
}
