import java.util.Scanner;
public class ex28_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input name of the day of the week: ");
		String name_day = in.nextLine();
		System.out.print("Input month: ");
		String month = in.nextLine();
		System.out.print("Input number of the day in the month: ");
		int number = in.nextInt();
		System.out.printf("Today is %s %d %s \n", name_day, number, month);
		in.close();
	}
}