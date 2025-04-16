import java.util.Scanner;
import java.time.Year;
public class ex28_6{
	public static void main(String[] args) {
		
		int currentYear = Year.now().getValue();// текущий год
		Scanner in = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = in.nextLine();
		System.out.print("Input year of birth: ");
		int year_dirth = in.nextInt();
		int age = currentYear - year_dirth;
		System.out.printf("Hallo %s you are %d years old\n",name, age);
		in.close();
	}
}