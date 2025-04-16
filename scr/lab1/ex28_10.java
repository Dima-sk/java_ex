import java.util.Scanner;
public class ex28_10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input first num: ");
		int num1 = in.nextInt();
		System.out.print("Input second num: ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		int raz = num1 - num2;
		System.out.printf("The sum of the numbers is %d \nThe difference between the numbers is %d\n ", sum, raz);
		in.close();
	}
}