package scr.Timus;
import java.util.HashMap;
import java.util.Scanner;

public class example28_1617 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            HashMap<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int diameter = scanner.nextInt();
                countMap.put(diameter, countMap.getOrDefault(diameter, 0) + 1);
            }

            int totalCars = 0;

            for (int count : countMap.values()) {
                totalCars += count / 4;
            }

            System.out.println(totalCars);
        }
}
