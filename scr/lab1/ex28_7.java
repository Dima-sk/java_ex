import java.util.Scanner;
import java.time.Year;
public class ex28_7 {
	public static void main(String[] args) {
		
		int currentYear = Year.now().getValue();// текущий год
		Scanner in = new Scanner(System.in);
		System.out.print("Input full age: ");
		int age = in.nextInt();
		int year_dirth = currentYear - age;
		System.out.printf("Hallo you were born in %d\n", year_dirth);
		in.close();
	}
}