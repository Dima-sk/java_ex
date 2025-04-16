import java.util.Scanner;
public class ex28_4{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input month: ");
		String month = in.nextLine();
		System.out.print("Input number of days: ");
		int quantity = in.nextInt();
		System.out.printf("There are %d days in %s \n", quantity, month);
		in.close();
	}
}