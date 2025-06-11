package scr.Timus;
import java.util.Scanner;
public class example28_1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество бифштексов и число которе можно положить на сковородку( через пробел)");
        String[] pars = scanner.nextLine().split(" ");
        int n = Integer.parseInt(pars[0]);
        int k = Integer.parseInt(pars[1]);
        if (n <= k) {
            System.out.println("Займет 2 мин");
        } else {
            int minutes = (2 * n + k - 1) / k; // Эквивалентно округлению вверх (2*n)/k
            System.out.println("Займет "+minutes+ " мин");
        }
    }
}
