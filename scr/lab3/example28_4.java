package scr.lab3;
import java.util.Scanner;
public class example28_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int a = scanner.nextInt();
        int max=0, min=-9999;
        if(n == a){
            max=a; min=a;
        }else if (n < a) {
            max=a; min=n;
        }else{
            max=n; min=a;
        }
        System.out.print("Через for: ");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Через while: ");
        int i=min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.print("Через do-while: ");
        i = min;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= max);
        scanner.close();
    }
}
