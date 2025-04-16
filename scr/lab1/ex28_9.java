import java.util.Scanner;
public class ex28_9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input num: ");
		int num = in.nextInt();
		int num0 = num - 1;
		int num1 = num + 1;
		double num2 = Math.pow(num0, 2) + Math.pow(num, 2) + Math.pow(num1, 2) + 2 * num0 * num + 2 * num0 * num1 + 2 * num * num1;
		System.out.printf("Result: %d, %d, %d, %f \n", num0, num, num1, num2 );
		in.close();
	}
}