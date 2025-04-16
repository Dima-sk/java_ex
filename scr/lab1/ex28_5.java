import java.util.Scanner;
import java.time.Year;
public class ex28_5 {
	public static void main(String[] args) {
		
		int currentYear = Year.now().getValue();// текущий год
		Scanner in = new Scanner(System.in);
		System.out.print("Input year of birth: ");
		int year_dirth = in.nextInt();
		int age = currentYear - year_dirth;
		System.out.printf("You are %d years old\n", age);
		in.close();
	}
}