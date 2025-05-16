package scr.lab3;
import java.util.Scanner;
public class example28_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = scanner.nextLine().toLowerCase();
        if (day.equals("понедельник")){
            System.out.println("1!");
            System.exit(0);
        }else if (day.equals("вторник")){
            System.out.println("2!");
            System.exit(0);
        }else if (day.equals("среда")){
            System.out.println("3!");
            System.exit(0);
        }else if (day.equals("четверг")){
            System.out.println("4!");
            System.exit(0);
        }
        switch (day) {
            case "пятница":
                System.out.println("5!");
                break;
            case "суббота":
                System.out.println("6!");
                break;
            case "воскресенье":
                System.out.println("7!");
                break;
            default:
                System.out.println("Введено некорректное значение.");
        }
    }
}
